package kr.or.ddit.hello;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.user.model.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/servlet-context.xml"})
@WebAppConfiguration    //spring ioc 컨테이너 구성을 web 환경에 맞게 구성
public class HelloControllerTest {
	
	private Logger logger = LoggerFactory.getLogger(HelloControllerTest.class);
	
	@Autowired
	private WebApplicationContext ctx; //spring ioc 컨테이너
	
	private MockMvc mockMvc; // dispatcher servlet (front controller) 역할을 하는 친구
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void test() throws Exception {
		/***Given***/
		

		/***When***/
		//dispatcher servlet으로 요청 전송
		MvcResult mvcResult = mockMvc.perform(get("/hello/hello.do")).andReturn();
		
		ModelAndView mav = mvcResult.getModelAndView();
		
		/***Then***/
		//view : hello
		assertEquals("hello", mav.getViewName());
		
	}
	
	@Test
	public void modelTest() throws Exception{
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/hello.model")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		
		@SuppressWarnings("unchecked")
		List<String> rangers = (List<String>)mav.getModel().get("rangers");
		
		for(String ranger : rangers) {
			logger.debug("ranger : {}", ranger);
		}
		
		
		/***Then***/
		//1. view 이름
		assertEquals("hello", viewName);
		
		//2. rangers 속성(model)
		assertEquals(3, rangers.size());
		
	}
	
	@Test
	public void requestTest() throws Exception{
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/hello/request").param("userId", "brown")
				.param("password", "brownpass")).andReturn();
		
		ModelAndView mav = mvcResult.getModelAndView();
		
		/***Then***/
		//1. view 이름
		String viewNaem = mav.getViewName();
		//2. rangers 속성(model)
		String userId = (String)mav.getModel().get("userId");
		String pass = (String)mav.getModel().get("pass");
		
		assertEquals("hello", viewNaem);
		assertEquals("brown_attr", userId);
		assertEquals("brownpass_attr", pass);
		
		
	}
	
	@Test
	public void voTest() throws Exception{
		
		MvcResult mvcResult = mockMvc.perform(get("/hello/vo").param("userId", "choi")).andReturn();
		
		
		ModelAndView mav = mvcResult.getModelAndView();
		
		UserVo user = (UserVo)mav.getModel().get("userVo");
		
		assertNotNull(user);
	}
	
	@Test
	public void modelAndViewTest() throws Exception{
		
		MvcResult mvcResult = mockMvc.perform(get("/hello/modelAndView")).andReturn();
		
		
		ModelAndView mav = mvcResult.getModelAndView();
		
		List<String> rangers = (List<String>)mav.getModel().get("rangers");
		
		for(String ranger : rangers) {
			logger.debug("ranger : {}", ranger);
		}
		
		assertEquals(3, rangers.size());
	}
	
	
	

}
