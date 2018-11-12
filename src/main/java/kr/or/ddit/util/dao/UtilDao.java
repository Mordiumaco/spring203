package kr.or.ddit.util.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UtilDao implements UtilDaoInf{

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	/**
	* Method : makeMonthlyCalender
	* 작성자 : pc20
	* 변경이력 :
	* @param ym
	* @return
	* Method 설명 : 월 단위 달력 생성 
	* 
	*/
	@Override
	public int makeMonthlyCalender(String ym) {
		int insertCnt = template.insert("util.makeMonthlyCalender", ym);
		return insertCnt;
	}
	
}
