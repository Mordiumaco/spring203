package kr.or.ddit.prod.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.prod.dao.ProdDaoInf;
import kr.or.ddit.prod.vo.ProdVO;
import kr.or.ddit.util.model.PageVo;

@Service("prodService")
public class ProdService implements ProdServiceInf{
	
	@Resource(name="prodDao")
	ProdDaoInf dao;

	@Override
	public List<ProdVO> selectUserForPage(PageVo page) {
		
		return dao.selectUserForPage(page);
	}

	@Override
	public List<ProdVO> selectUserAll() {
		return dao.selectUserAll();
	}
	
	
}
