package kr.or.ddit.mvc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.ddit.user.model.JSPUserVO;

@RequestMapping("ajax")
@Controller
public class AjaxController {
	
	private Logger logger = LoggerFactory.getLogger(AjaxController.class);
	
	//http://localhost:8081/ajax/view
	//ajax test를 위한 view 요청 
	@RequestMapping("view")
	public String view() {
		return "ajax/view";
	}
	
	@ResponseBody
	@RequestMapping(value="/getRangers", produces= {"application/json"})
	public List<JSPUserVO> getRangers(@RequestBody JSPUserVO userVo) {
		
		logger.debug("json : {}", userVo);
		
		List<JSPUserVO> rangers = new ArrayList<>();
		rangers.add(new JSPUserVO("brown","브라운"));
		rangers.add(new JSPUserVO("sally","샐리"));
		rangers.add(new JSPUserVO("cony","코니"));
		
		return rangers;
	}
}
