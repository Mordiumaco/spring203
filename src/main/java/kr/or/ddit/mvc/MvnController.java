package kr.or.ddit.mvc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.file.service.FileServiceInf;
import kr.or.ddit.util.FileUtil;


//@ModelAttribute에 의해 저장된 속성이 있을 경우 
//재요청시 @ModelAttribute가 적용된 메소드를 재실행하지 않고
//세션에 저장하여 값을 재활용(잘 변경되지 않는 값을 저장할 경우 메소드가 매번 호출되는 과부하를 줄일 수 있다)
@SessionAttributes("rangers")
@Controller
public class MvnController {
	
	@Resource(name="fileService")
	FileServiceInf fileSerivce;
	
	Logger logger = LoggerFactory.getLogger(MvnController.class);
	//@RequestMapping이 붙은 메서드가 실행되기 전에 먼저 실행이 된다
	//해당 컨트롤러에서 공통적으로 사용될 속성이 있을 경우
	//중복을 피하기 위해 @ModelAttribute 어노테이션을 적용한
	//메서드를 통해 코드 중복을 막을 수 있음 
	//(실질적으로 잘 쓰지는 않는다. 쓰는게 제한적이다) 
	
	
	//==================================
	//리턴타입 변경해서 테스트 해보기
	//==================================
	@ModelAttribute(value="rangers")
	public void setup(Model model) {
		logger.debug("{}", "setup");
		
		List<String> rangers = new ArrayList<>();
		rangers.add("brown");
		rangers.add("cony");
		rangers.add("sally");
		
		model.addAttribute("rangers", rangers);
		
	}
	
	
	
	@RequestMapping("/mvc/view")
	public String mvcView(@ModelAttribute("rangers")List<String> rangers) {
		
		rangers.add("ryan");
		
		return "mvc/view";
	}
	
	
	@RequestMapping("/mvc/view2")
	public String mvcView2() {
		return "mvc/view";
	}
	
	
	//@pathVariable: 요청 url의 일부를 메소드 인자로 쉽게 받을 수 있는 어노테이션
	//http://localhost:8081/mvc/central : logger central
	//http://localhost:8081/mvc/left : logger left
	@RequestMapping("/mvc/{libcd}/test")
	public String pathVariable(@PathVariable("libcd") String libcd) {
		
		logger.debug("libcd : {}", libcd);
		
		return "mvc/view";
	}
	
	/*예를 들어 mvc/dkdkt << 라고 url 검색을 했을 경우 
	 *같은 아스트릭을 갖고 있어도 뒤에 t가 붙어있는 메서드가 같이 실행된다.  
	 *
	 * 
	 * 
	 * 
	 * @RequestMapping("/mvc/*")
	
	public String pathVariable2() {
		logger.debug("test2");
		return "mvc/view";
	}
	
	@RequestMapping("/mvc/*t")
	public String test() {
		logger.debug("test1");
		return "mvc/view";
		
		
	}*/
	
	
	
	//fileupload 테스트를 위한 view(get)
	@RequestMapping(value="mvc/fileupload", method= {RequestMethod.GET})
	public String fileuploadView() {
		logger.debug("test1");
		return "mvc/fileuploadView";
	}
	
	//fileupload(파일 전송)을 위한 controller method(post)
	@RequestMapping(value="mvc/fileupload", method= {RequestMethod.POST})
	public String fileuploadView2(HttpServletResponse response ,@RequestPart("uploadFile") MultipartFile part, @RequestParam("userId") String userId) {
		
		logger.debug("requestParam userId : {}", userId);
		logger.debug("partSize : {}", part.getSize());
		logger.debug("OriginalFilename : {}", part.getOriginalFilename());
		
		//1. File객체 생성(경로 + 파일명 ==> 파일명 충돌 방지를 위해 유니크 한 임의의 파일명을 생성) 
		
		String path = "D:\\A_TeachingMaterial\\6.JspSrpgin\\upload";
		String fileName = UUID.randomUUID().toString();
		String originalFileName = part.getOriginalFilename();
		
		File file = new File(path + File.separator +fileName);
		
		FileVo fileVo = new FileVo();
		fileVo.setFile_name(fileName);
		fileVo.setFile_path(path);
		fileVo.setOrg_file_name(originalFileName);
		String fileExt = new FileUtil().getFileExt(originalFileName);
		fileVo.setFile_ext(fileExt);
		
		logger.debug("fileVo : {}", fileVo );
		
		//FileUtil.getFileExt(String fileName);
		//확장자가 있을경우 .을 포함한 확장자 값을 리턴
		//확장자가 없을경우 "" whitespace를 리턴 
		//ex ) 테스트값 : sally.png ==> .png
		//테스트값 : sally == ""
		
		try {
			//정해진 path에 업로드 파일을 작성
			
			//파일의 사이즈가 0 이상일때만 로직 호출
			if(part.getSize() > 0) {
				part.transferTo(file);
				
				int insertCnt = fileSerivce.insertFile(fileVo);
				
				if(insertCnt == 1) {
					logger.debug("생성 완료 : {} ", fileVo);
					PrintWriter writer = response.getWriter();
					writer.println("<script>");
					writer.println("alert('파일생성 완료');");
					writer.println("</script>");
				}
			}
			
			//데이터 베이스에 첨부파일 정보 저장
			//1.fileService 
			//2.로직 호출
			
		}catch(IllegalStateException|IOException e) {
			e.printStackTrace();
		}
		
		
		
		logger.debug("test2");
		return "mvc/fileuploadView";
	}
	
}
