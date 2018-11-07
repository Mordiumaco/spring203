package kr.or.ddit.prod.dao;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;
import kr.or.ddit.util.model.PageVo;

public interface ProdDaoInf {
	
	public List<ProdVO> selectUserForPage(PageVo page);
	
	public List<ProdVO> selectUserAll();
}
