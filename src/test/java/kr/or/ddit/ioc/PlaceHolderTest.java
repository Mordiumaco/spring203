package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context-placeholder.xml"})
public class PlaceHolderTest {

	@Autowired
	PlaceHolder placeholder;
	
	@Test
	public void placeholderTest() {
		
		Logger logger = LoggerFactory.getLogger(PlaceHolder.class);
		
		logger.debug("PlaceHolder : {}", placeholder);
		
		assertEquals("pc20test", placeholder.getUser());
		assertEquals("java", placeholder.getPassword());
		
	}

}
