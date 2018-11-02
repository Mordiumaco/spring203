package kr.or.ddit.mvc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvnController {
	
	Logger logger = LoggerFactory.getLogger(MvnController.class);
	//@RequestMapping이 붙은 메서드가 실행되기 전에 먼저 실행이 된다
	//해당 컨트롤러에서 공통적으로 사용될 속성이 있을 경우
	//중복을 피하기 위해 @ModelAttribute 어노테이션을 적용한
	//메서드를 통해 코드 중복을 막을 수 있음 
	//(실질적으로 잘 쓰지는 않는다. 쓰는게 제한적이다) 
	
	
	//==================================
	//리턴타입 변경해서 테스트 해보기
	//==================================
	@ModelAttribute
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
}
