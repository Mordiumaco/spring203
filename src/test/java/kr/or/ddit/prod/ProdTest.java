package kr.or.ddit.prod;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import kr.or.ddit.prod.dao.ProdDaoInf;
import kr.or.ddit.prod.vo.ProdVO;
import kr.or.ddit.test.ServiceDaoTestConfig;

public class ProdTest extends ServiceDaoTestConfig{
	
	@Autowired
	ProdDaoInf prodDao;
	
	
	@Test
	public void ProdAllSelectTest() {
		
		List<ProdVO> prodList = prodDao.selectUserAll();
		
		assertEquals(74, prodList.size());
	}

}
