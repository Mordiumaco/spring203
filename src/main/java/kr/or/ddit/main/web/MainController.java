package kr.or.ddit.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	/**
	* Method : main
	* 작성자 : pc20
	* 변경이력 :
	* @return
	* Method 설명 : main 화면 요청.
	*/
	@RequestMapping("/main")
	public String main() {
		return "main";
				
		//viewName "main"
		//우선 순위에 따라 viewResolver를 검색
		//1.beanNameViewResoltver
		//1-1 bean id(name)가 main인 bean이 있는지 확인 -> 없음 
		//2.tilesViewResolver
		//2-1.tiles-config.xml에서 main 이라는 이름의 defination이 있는지 확인 
		//2-2.해당 defination에 맞는 
	}
	
}
