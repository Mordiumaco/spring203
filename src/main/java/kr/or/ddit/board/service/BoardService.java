package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;

public class BoardService implements BoardServiceInf {
	
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
