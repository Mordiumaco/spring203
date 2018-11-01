package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context-scan.xml"})
public class ComponentScanTest {

	@Autowired
	private BoardDaoInf boardDao;
	
	@Autowired
	private BoardServiceInf boardService;
	
	/**
	* Method : componentScanTest
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 : spring annotation scan을 통해 생성성된
	*/
	@Test
	public void componentScanTest() {
		/***Given***/
		Logger logger = LoggerFactory.getLogger(ComponentScanTest.class);
		
		/***When***/
		
		List<BoardVo> boardList = boardDao.selectBoardList();
		for(BoardVo board : boardList) {
			logger.debug("boardList(DAO) : {}",board);
		}
		
		/***Then***/
		assertNotNull(boardDao);
		
	}
	
	@Test
	public void boardServiceScanTest() {
		Logger logger = LoggerFactory.getLogger(ComponentScanTest.class);
		
		List<BoardVo> boardList = boardService.selectBoardList();
		for(BoardVo board : boardList) {
			logger.debug("boardList(SERVICE) : {}",board);
		}
		
		assertNotNull(boardService);
		
	}
	
	
	@Test
	public void boardDaoSameTest() {
		Logger logger = LoggerFactory.getLogger(ComponentScanTest.class);
		
		logger.debug("boardSame: {}", boardDao == boardService.getBoardDao());
		assertSame(true, boardDao == boardService.getBoardDao());
		
	}
}
