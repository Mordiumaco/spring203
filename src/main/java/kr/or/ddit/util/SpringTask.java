package kr.or.ddit.util;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.util.dao.UtilDaoInf;


public class SpringTask {
	
	@Resource(name="utilDao")
	private UtilDaoInf utilDao;
	
	private Logger logger = LoggerFactory.getLogger(SpringTask.class);
	
	public void logging() {
		logger.debug(" SpringTask.logging() : {}");
	}
	
	/**
	* Method : makeMonthlyCalendar
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 : 매달 마지막날 월 단위 달력 생성 
	*/
	//이 메소드가 실행되는 시점은 매달 마지막날 생성됨 
	//해당 달 다음달 파라미터를 생성하여 실행(2018년 11월 30일 실행 --> 201812
	public void makeMonthlyCalendar() {
		
		
		GregorianCalendar gc = new GregorianCalendar(Locale.KOREA);
		gc.add(GregorianCalendar.MONTH, 1);
		//date --> string(yyyyMM)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String ym = sdf.format(gc.getTime());
		
		logger.debug("ym : {}", ym);
		
		utilDao.makeMonthlyCalender(ym);
	}
}
