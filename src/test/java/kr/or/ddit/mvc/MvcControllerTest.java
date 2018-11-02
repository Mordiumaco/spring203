package kr.or.ddit.mvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unchecked")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/servlet-context.xml"})
@WebAppConfiguration 
public class MvcControllerTest {

	private Logger logger = LoggerFactory.getLogger(MvcControllerTest.class);
	
	@Autowired
	private WebApplicationContext ctx; //spring ioc 컨테이너
	
	private MockMvc mockMvc; // dispatcher servlet (front controller) 역할을 하는 친구
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void mvcViewTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/view")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		
		List<String> rangers = (List<String>)mav.getModel().get("rangers");
		
		for(String ranger : rangers) {
			
			logger.debug("range {}", ranger);
			
		}
		
		/***Then***/
		assertEquals("mvc/view", viewName);
		
		//model 객체에서 rangers 리스트 속성을 받아 사이즈가 3인지 체크
		assertEquals(4, rangers.size());
		
	}

}
