package kr.or.ddit.file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.file.dao.FileDaoInf;
import kr.or.ddit.file.model.FileVo;

@Service("fileService")
public class FileService implements FileServiceInf{
	
	@Autowired
	FileDaoInf fileDao;
	
	
	/**
	* Method : insertFile
	* 작성자 : pc20
	* 변경이력 :
	* @param fileVo
	* @return
	* Method 설명 : 파일 정보 저장
	*/
	@Override
	public int insertFile(FileVo fileVo) {
		return fileDao.insertFile(fileVo);
	}
}
