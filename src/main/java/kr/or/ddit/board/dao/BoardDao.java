package kr.or.ddit.board.dao;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.board.model.BoardVo;

public class BoardDao implements BoardDaoInf{
	
	
	@Override
	public List<BoardVo> selectBoardList() {
		//db에서 조회 해온 데이터라고 가정
		BoardVo boardVo = new BoardVo(1, "자유게시판", "brown");
		BoardVo boardVo2 = new BoardVo(2, "QnA게시판", "sally");
		BoardVo boardVo3 = new BoardVo(3, "공지게시판", "cony");
		
		List<BoardVo> boardList = new ArrayList<BoardVo>();
		boardList.add(boardVo);
		boardList.add(boardVo2);
		boardList.add(boardVo3);
		
		return boardList;
	}

}
