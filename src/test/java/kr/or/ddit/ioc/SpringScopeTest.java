package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDaoInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context.xml"})
public class SpringScopeTest {

	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	
	@Resource(name="boardDaoSingleton")
	private BoardDaoInf boardDaoSingleton;
	
	@Resource(name="boardDaoSingleton")
	private BoardDaoInf boardDaoSingleton2;
	
	/**
	* Method : springBeanScopeSingletonTest
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 : 스프링의 scope singleton 테스트
	*/
	@Test
	public void springBeanScopeSingletonTest() {
		/***Given***/

		/***When***/

		/***Then***/
		boolean test = boardDaoSingleton2 == boardDaoSingleton;
		
		//이를 통해 알수 있는것 .
		//싱글톤은 xml 에서 id 기준으로 형성이 된다. 
		//같은 클래스더라도 아이디가 다르면 객체가 다르게 형성됨
		//아이디가 같으면 객체가 같다는걸 알 수 있다. 
		
		assertEquals(true, test);
	}
	
	
}
