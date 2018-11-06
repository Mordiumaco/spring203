package kr.or.ddit.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SQLFactoryBuilder;
import kr.or.ddit.user.model.JSPUserVO;
import kr.or.ddit.util.model.PageVo;


@Repository("userDao")
public class UserDao implements UserDaoInf{
	
	//jspuser 테이블 데이터 전체 조회 쿼리 
	//select query id : selectUserAll
	
	public List<JSPUserVO> selectUserAll(){
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		List<JSPUserVO> userList = session.selectList("userSQL.selectUserAll");
		session.close();
		//selectOne: 데이터가 한건일때
		//selectList: 여러건의 데이터를 조회 
		//메서드 인자: 문자열 = 네임스페이스(모듈명).쿼리아이디
		return userList;
	}
	
	public JSPUserVO selectUser(String userId){
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		//selectOne: 데이터가 한건일때
		//selectList: 여러건의 데이터를 조회 
		//메서드 인자: 문자열 = 네임스페이스(모듈명).쿼리아이디
		JSPUserVO userVo = session.selectOne("userSQL.selectUser", userId);
		session.close();
		
		return userVo;
	}
	
	public JSPUserVO selectUserByUserVO(JSPUserVO user){
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		//selectOne: 데이터가 한건일때
		//selectList: 여러건의 데이터를 조회 
		//메서드 인자: 문자열 = 네임스페이스(모듈명).쿼리아이디
		JSPUserVO userVo = session.selectOne("userSQL.selectUserByUserVO", user);
		//꼭 세션을 닫아주자 그래야 커밋이 제대로 된다. 마이바티스의 경우
		
		session.close();
		
		return userVo;
	}

	/**
	* 
	* Method : selectUserPageList
	* 작성자 : pc20
	* 변경이력 :
	* @param page
	* @return
	* Method 설명 : 사용자 페이징 조회 
	*/
	@Override
	public List<JSPUserVO> selectUserPageList(PageVo page) {
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		//selectOne: 데이터가 한건일때
		//selectList: 여러건의 데이터를 조회 
		//메서드 인자: 문자열 = 네임스페이스(모듈명).쿼리아이디
		
		List<JSPUserVO> userList = session.selectList("userSQL.selectUserPageList", page);
		//꼭 세션을 닫아주자 그래야 커밋이 제대로 된다. 마이바티스의 경우
		session.close();
		
		return userList;
	}

	/**
	* Method : getUserCnt
	* 작성자 : pc20
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 건수 조회
	*/
	@Override
	public int getUserCnt() {
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		int totalUserCnt = session.selectOne("userSQL.getUserCnt");
		session.close();
		
		return totalUserCnt;
	}
	
	
	/**
	* Method : getUserCnt
	* 작성자 : pc20
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 등록
	*/
	@Override
	public int insertUser(JSPUserVO user) {
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		int insertCnt = session.insert("userSQL.insertUser", user);
		
		//insert 한 후에는 꼭 커밋을 해주자!
		session.commit();
		session.close();
		
		return insertCnt;
	}

	
	
	/**
	* Method : deleteUser
	* 작성자 : pc20
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 삭제
	*/
	@Override
	public int deleteUser(String userId) {
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		int deleteCnt = session.delete("userSQL.deleteUser", userId);
		
		session.commit();
		session.close();
		
		return deleteCnt;
	}

	@Override
	public int updateProfile(JSPUserVO user) {
		
		SqlSessionFactory factory = SQLFactoryBuilder.getSqlSessionFactory();
		
		SqlSession session = factory.openSession();
		
		int updateCnt = session.update("userSQL.updateProfile", user);
		session.commit();
		session.close();
		
		return updateCnt;
	}
	
	
}
