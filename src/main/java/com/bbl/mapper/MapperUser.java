package com.bbl.mapper;

import com.bbl.domain.user.EmailVO;
import com.bbl.domain.user.SearchListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperUser {

	/*
	 * 회원가입 유무 체크 */
	boolean checkResister(EmailVO emailVO);







	/*
	 * 검색
	 *
	 * 페이징 필요
	 *
	 *
	 * */
	List<SearchListVO> searchKeyword(String keyword);




	/*
	* 테스트
	* */
	void insertTest(String str);

}
