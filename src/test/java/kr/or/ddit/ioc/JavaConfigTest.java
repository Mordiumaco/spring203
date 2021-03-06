package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardServiceInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {JavaConfig.class})
public class JavaConfigTest {
	
	//@Autowired
	@Resource(name="getBoardDao")
	private BoardDaoInf boardDao;
	
	//@Autowired
	@Resource(name="boardService")
	private BoardServiceInf boardService;
	
	/**
	* Method : javaConfigBeanTest
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 : javaconfig를 통해 스프링 빈이 정상적으로 생성 되었는지 테스트
	*/
	@Test
	public void javaConfigBeanTest() {
		
		Logger logger = LoggerFactory.getLogger(ComponentScanTest.class);
		
		List<BoardVo> boardList = boardService.selectBoardList();
		for(BoardVo board : boardList) {
			logger.debug("boardList(SERVICE) : {}",board);
		}
		
		boardList = boardDao.selectBoardList();
		for(BoardVo board : boardList) {
			logger.debug("boardList(DAO) : {}",board);
		}
		
		
		assertNotNull(boardDao);
		assertNotNull(boardService);
		
	}

}
