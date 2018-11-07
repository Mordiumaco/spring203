package kr.or.ddit.prod.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SQLFactoryBuilder;
import kr.or.ddit.prod.vo.ProdVO;
import kr.or.ddit.util.model.PageVo;

@Repository("prodDao")
public class ProdDao implements ProdDaoInf {
	
	@Override
	public List<ProdVO> selectUserForPage(PageVo page) {
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();

		SqlSession session = factory.openSession();
		
		List<ProdVO> prodList = session.selectList("prodSQL.selectUserForPage", page);
		
		session.close();
		
		return prodList;
	}

	@Override
	public List<ProdVO> selectUserAll() {
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();

		SqlSession session = factory.openSession();
		
		List<ProdVO> prodList = session.selectList("prodSQL.selectUserAll");
		
		session.close();
		
		return prodList;
	}
}
