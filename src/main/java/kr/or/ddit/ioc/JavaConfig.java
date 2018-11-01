package kr.or.ddit.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceInf;

//Bean annotation을 가지면 겉으로는 객체가 생성되는것처럼 보이나 실질적으로는 싱글톤형태로 적용이 됨
@Configuration
public class JavaConfig {
	
	//boardDao spring bean 등록
	//<bean id = "boardDao" class="kr.or.ddit.board.dao.BaordDao"/>
	@Bean
	public BoardDaoInf getBoardDao() {
		return new BoardDao();
	}
	
	//boardService spring bean 등록
	@Bean
	public BoardServiceInf boardService() {
		BoardServiceInf boardService = new BoardService();
		boardService.setBoardDao(getBoardDao());
		
		return boardService;
	}
	
	
}
