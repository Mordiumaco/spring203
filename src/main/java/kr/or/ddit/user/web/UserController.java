package kr.or.ddit.user.web;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.user.model.JSPUserVO;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.UserServiceInf;
import kr.or.ddit.util.model.PageVo;


@RequestMapping("/user")
@Controller
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	//userSErvice 스프링빈 주입
	@Resource(name="userService")
	private UserServiceInf userService;
	
	@RequestMapping("/userAllList")
	public String userAllList(Model model) {
		//userService 사용자 전체 정보 조회 
		List<JSPUserVO> userList = userService.selectUserAll();
		
		model.addAttribute("user_list", userList);
		
		return "user/userAllList";
	}
	
	@RequestMapping("/userPageList")
	public String userPageList(Model model, PageVo pageVo) {
		
		Map<String, Object> resultMaps = userService.selectUserPageList(pageVo);
		model.addAllAttributes(resultMaps);
		
		//
		
		return "user/userPagingList";
	}
	
	//param annotation을 이용해서 해보자 
	@RequestMapping("/userDetail")
	public String userDetail(@RequestParam("userId") String userId, Model model) {
		
		/*
		 * String userId = request.getParameter("userId");
		 */
		//@RequestParam 어노테이션을 통해 설정 
		
		JSPUserVO userVo = userService.selectUser(userId);
		
		model.addAttribute("user", userVo);
		
		return "user/userDetail";
	}
	
	@RequestMapping(value="/userForm", method=RequestMethod.GET)
	public String userFormView() {
		return "user/userForm";
	}
	
	@RequestMapping(value="/userForm", method=RequestMethod.POST)
	public String userForm(@RequestPart("profilePic") MultipartFile part, HttpServletRequest request
			,JSPUserVO userVo) {
		
		String path = request.getServletContext().getRealPath("/profile");
		
		String fileName = part.getOriginalFilename();
		
		userVo.setProfile("/profile/"+fileName);
		
		userService.insertUser(userVo);
		
		try {
			part.transferTo(new File(path+File.separator+fileName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		return "login/login";
	}
	
	
	@RequestMapping("loginView")
	public String loginView() {
		
		return "login/login";
	}
	
	
	@RequestMapping(value= {"loginProcess"}, method= {RequestMethod.POST})
	public String loginProcess(UserVo userVo) {
		
		if("brown".equals(userVo.getUserId()) && "brownpass".equals(userVo.getPassword())) {
			return "main";
		}
		
		return "login/login";
	}
	
}
