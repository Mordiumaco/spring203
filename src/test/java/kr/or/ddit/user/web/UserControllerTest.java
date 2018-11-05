package kr.or.ddit.user.web;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/servlet-context.xml","classpath:kr/or/ddit/config/spring/root-context.xml"})
@WebAppConfiguration
public class UserControllerTest {
	
	private Logger logger = LoggerFactory.getLogger(UserControllerTest.class);
	
	@Autowired
	WebApplicationContext ctx;
	
	private MockMvc mvc;
	
	@Before
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void userProcessSuccessTest() throws Exception{
		
		MvcResult mr = mvc.perform(post("/user/loginProcess").param("userId", "brown").param("password", "brownpass")).andReturn();
		
		ModelAndView mav = mr.getModelAndView();
		logger.debug("ModelAndView {}", mav);
		
		String result = mav.getViewName();
		logger.debug("ModelAndView {}", result);
		
		assertEquals("main", result);
		
	}
	
	@Test
	public void userProcessFailTest() throws Exception{
		
		MvcResult mr = mvc.perform(post("/user/loginProcess").param("userId", "brow1").param("password", "brownpass")).andReturn();
		
		ModelAndView mav = mr.getModelAndView();
		logger.debug("ModelAndView {}", mav);
		
		String result = mav.getViewName();
		logger.debug("ModelAndView {}", result);
		
		assertEquals("login/login", result);
		
	}

}
