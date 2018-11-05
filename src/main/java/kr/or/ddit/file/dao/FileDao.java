package kr.or.ddit.file.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SQLFactoryBuilder;
import kr.or.ddit.file.model.FileVo;

//spring bean으로 등록 @Repository(이름을 안붙이면 class명에서 앞글자만 소문자로 변경한 텍스트가 spring bean이름이 됨) 
@Repository //fileDao
public class FileDao implements FileDaoInf {

	SqlSessionFactory sessionFactory;
	
	public FileDao() {
		sessionFactory = SQLFactoryBuilder.getSqlSessionFactory();
	}
	
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
		
		SqlSession session = sessionFactory.openSession();
		
		//sql 호출 
		int insertCnt = session.insert("file.insertFile", fileVo);
		
		//트랜젝션 commit, session close
		session.commit();
		session.close();
		
		return insertCnt;
	}
	
	
	
}
