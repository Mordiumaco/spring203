package kr.or.ddit.test;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//service, dao 에 대한 설정파일만 필요하다. 
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/root-context.xml",
		"classpath:kr/or/ddit/config/spring/datasource-test-context.xml",
		"classpath:kr/or/ddit/config/spring/transaction-context.xml",
		"classpath:kr/or/ddit/config/spring/batch-context.xml"})
public class ServiceDaoTestConfig {
	
	@Resource(name="dataSource")
	private DataSource dataSource; 
	
	@Before
	public void rangerSetup() {
		//데이터 초기화 
		//delete query 호출  --> sql 스크립트를 실행해주는 녀석
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		//여러개 sql 문 추가도 가능하다.
		populator.addScript(new ClassPathResource("kr/or/ddit/config/db/dbInit.sql"));
		//테스트 환경이 아니여서 오류가 날경우 진행이 안되도록 만듬 
		populator.setContinueOnError(false);
		DatabasePopulatorUtils.execute(populator, dataSource);
	}
	
	@Test @Ignore
	public void ConfigTest() {
		
	}
}
