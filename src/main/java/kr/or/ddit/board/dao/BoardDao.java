package kr.or.ddit.board.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.ddit.board.model.BoardVo;

//어노테이션을 통한 빈 등록
//bean 어노테이션은 @Controller, @Service, @Repository, @Component
//@Controller controller
//@Service : service
//@Repository dao
//@Component 일반적인 객체
//@Controller , @ Service, @Repository 어노테이션은 @Component 어노테이션을 기반으로 확장
//
//어노테이션 자체가 특별한 기능을 담고 있는 것은 아니다.
//개발에 자주 사용되는 모듈을 분리하여 명명한 것에 불과 
//
@Repository("boardDao")
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
