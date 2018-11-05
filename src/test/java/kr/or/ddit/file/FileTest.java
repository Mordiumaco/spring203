package kr.or.ddit.file;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.util.FileUtil;

public class FileTest {
	
	Logger logger = LoggerFactory.getLogger(FileTest.class);
	FileUtil fileUtil;
	
	@Before
	public void setup() {
		fileUtil = new FileUtil();
	}
	
	
	//테스트 코드를 운영보드보다 먼저 작성하는 방법
	//TDD : Test Driven Development
	/**
	* Method : getFileExtTestSuccess
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 :확장자가 있는 경우
	*/
	@Test
	public void getFileExtTestSuccess() {
		
		String fileName = "sally.png";
		
		String result = fileUtil.getFileExt(fileName);
		
		logger.debug("result : {}", result);
		
		assertEquals(".png", result);
	}
	
	/**
	* Method : getFileExtTestFail
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 :확장자가 없는 경우
	*/
	@Test
	public void getFileExtTestFail() {
		
		String fileName = "sally";
		
		String result = fileUtil.getFileExt(fileName);
		
		logger.debug("result : {}", result);
		
		assertEquals("", result);
	}
	
	/**
	* Method : getFileExtTestFail
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 :확장자가 없는 경우
	*/
	@Test
	public void getFileExtTestMultiDot() {
		
		String fileName = "sally.brown.png";
		
		String result = fileUtil.getFileExt(fileName);
		
		logger.debug("result : {}", result);
		
		assertEquals(".png", result);
	}
	
}
