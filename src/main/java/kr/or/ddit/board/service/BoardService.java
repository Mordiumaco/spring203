package kr.or.ddit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;

@Service("boardService")
public class BoardService implements BoardServiceInf {
	
	@Autowired
	private BoardDaoInf boardDao;
	
	public BoardService() {
		
	}

	public BoardService(BoardDaoInf boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public List<BoardVo> selectBoardList() {
		return boardDao.selectBoardList();
	}

	public BoardDaoInf getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDaoInf boardDao) {
		this.boardDao = boardDao;
	}
	
}
