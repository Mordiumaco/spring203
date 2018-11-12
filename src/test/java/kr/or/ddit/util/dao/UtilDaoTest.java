package kr.or.ddit.util.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.test.ServiceDaoTestConfig;

public class UtilDaoTest extends ServiceDaoTestConfig {
	
	@Resource(name="utilDao")
	private UtilDaoInf utilDao;
	
	
	/**
	* Method : makeMonthlyCalenderTest
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 : 월 단위 달력 생성 테스트
	*/
	@Test
	public void makeMonthlyCalenderTest() { 
		/***Given***/
		String ym = "201811";	

		/***When***/
		int insertCnt = utilDao.makeMonthlyCalender(ym);
		
		/***Then***/
		assertEquals(30, insertCnt);
		
	}

}
