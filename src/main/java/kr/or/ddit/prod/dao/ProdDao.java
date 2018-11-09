package kr.or.ddit.prod.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.prod.vo.ProdVO;
import kr.or.ddit.util.model.PageVo;

@Repository("prodDao")
public class ProdDao implements ProdDaoInf {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public List<ProdVO> selectUserForPage(PageVo page) {
		
		List<ProdVO> prodList = template.selectList("prodSQL.selectUserForPage", page);
		
		return prodList;
	}

	@Override
	public List<ProdVO> selectUserAll() {
		
		List<ProdVO> prodList = template.selectList("prodSQL.selectUserAll");
		
		
		return prodList;
	}
}
