package kr.or.ddit.user.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import kr.or.ddit.test.ServiceDaoTestConfig;
import kr.or.ddit.user.model.JSPUserVO;
import kr.or.ddit.user.service.UserService;
import kr.or.ddit.user.service.UserServiceInf;
import kr.or.ddit.util.model.PageVo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends ServiceDaoTestConfig{
	
	@Autowired
	private UserServiceInf service;
	
	@Test
	public void selectUserAll() {
		/***Given***/

		/***When***/
		List<JSPUserVO> user_list = service.selectUserAll();
		
		System.out.println(user_list.get(0).getName());
		/***Then***/

		assertEquals(113, user_list.size());
	}
	
	@Test
	public void selectUserTest() {
		/***Given***/
		
		/***When***/
		JSPUserVO user= service.selectUser("brown");
		
		/***Then***/
		assertNotNull(user);
		assertEquals("brown", user.getUserId());
		assertEquals("f01471c38113db263f9a532d8b6c054af31bf653aeea92d1c284cdd022b9", user.getPassword());
	}
	
	@Test
	public void selectUserByUserVO() {
		/***Given***/
		JSPUserVO user_input = new JSPUserVO();
		user_input.setUserId("brown");
		
		/***When***/
		JSPUserVO user= service.selectUserByUserVO(user_input);
		
		/***Then***/
		assertNotNull(user);
		assertEquals("brown", user.getUserId());
	}

	@Test
	public void selectUserPageList(){
		/***Given***/
		PageVo page = new PageVo();
		page.setPage(1);
		page.setPageSize(10);
		Map<String, Object> resultMap = service.selectUserPageList(page);
		System.out.println(resultMap);
		/***When***/
		
		/***Then***/
		assertEquals(10, ((List<JSPUserVO>)resultMap.get("userList")).size());
	}
}
