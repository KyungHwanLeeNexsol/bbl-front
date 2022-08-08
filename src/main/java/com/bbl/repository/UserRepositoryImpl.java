package com.bbl.repository;

import com.bbl.domain.user.EmailVO;
import com.bbl.domain.user.SearchListVO;
import com.bbl.mapper.MapperUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

	Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

	private final	MapperUser mapperUser;

	public UserRepositoryImpl(MapperUser mapperUser) {
		this.mapperUser = mapperUser;
	}


	/*
	 * 회원가입 유무 체크 */
	@Override
	public boolean checkResister(EmailVO emailVO) {
		logger.info("userrepo - checkResister");
		return mapperUser.checkResister(emailVO);
	}


	/*
	 * 검색
	 * 페이징 필요
	 * 키워드 'ㅁㅁ+ㅁㅁ+ㅁㅁ'
	 * 띄어쓰기 나눠서 DB에서 검색할지 결정해야함
	 * */
	@Override
	public List<SearchListVO> searchKeyword(String keyword) {
		return mapperUser.searchKeyword(keyword);
	}

	/*
	* 테스트
	* */
	/*public void insertTest(String str) {
		logger.info("db insert test");
		mapperUser.insertTest(str);
	}
*/

}
