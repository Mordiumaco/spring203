package kr.or.ddit.main.web;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTestConfig;

public class MainTest extends ControllerTestConfig {

	
	@Test
	public void mainViewTest() throws Exception {
		
		/***Given***/
		
		MvcResult mvcResult = mockMvc.perform(get("/main")).andReturn();

		/***When***/

		ModelAndView mav = mvcResult.getModelAndView();
		/***Then***/
		assertEquals("main", mav.getViewName());
	}

}
