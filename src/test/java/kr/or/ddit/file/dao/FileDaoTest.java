package kr.or.ddit.file.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.file.model.FileVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:kr/or/ddit/config/spring/root-context.xml"})
public class FileDaoTest {
	
	@Resource(name="fileDao")
	private FileDaoInf fileDao;
	
	
	/**
	* Method : insertFileTest
	* 작성자 : pc20
	* 변경이력 :
	* Method 설명 : 파일정보 입력 테스트
	*/
	@Test
	public void insertFileTest() {
		
		FileVo fileVo = new FileVo();
		fileVo.setFile_name("addf1908-37d4-487f-ae33-3a9d633f80dd.png");
		fileVo.setFile_path("D:\\\\A_TeachingMaterial\\\\6.JspSrpgin\\\\upload");
		fileVo.setOrg_file_name("sally.png");
		fileVo.setFile_ext(".png");
		
		int insertCnt = fileDao.insertFile(fileVo);
		
		assertEquals(1, insertCnt);
	}

}
