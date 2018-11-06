package kr.or.ddit.file.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.test.ServiceDaoTestConfig;

public class FileServiceTest extends ServiceDaoTestConfig {
	
	@Autowired
	FileServiceInf fileService;
	
	@Test()
	public void fileServiceInsertTest() {
		
		FileVo fileVo = new FileVo();
		fileVo.setFile_name("addf1908-37d4-487f-ae33-3a9d633f80dd.png");
		fileVo.setFile_path("D:\\\\A_TeachingMaterial\\\\6.JspSrpgin\\\\upload");
		fileVo.setOrg_file_name("sally.png");
		fileVo.setFile_ext(".png");
		
		int insertCnt = fileService.insertFile(fileVo);
		
		assertEquals(1, insertCnt);
	}

}
