package kr.or.ddit.user.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.user.model.UserVo;


@RequestMapping("/user")
@Controller
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
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
