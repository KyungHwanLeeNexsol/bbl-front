package com.bbl.repository;


import com.bbl.domain.user.EmailVO;
import com.bbl.domain.user.SearchListVO;

import java.util.List;

public interface UserRepository {

	/*
	 * 회원가입 유무 체크 */
	boolean checkResister(EmailVO emailVO);

	/*
	 * 검색
	 * 페이징 필요
	 * 키워드 'ㅁㅁ+ㅁㅁ+ㅁㅁ'
	 * 띄어쓰기 나눠서 DB에서 검색할지 결정해야함
	 *
	 * */
	List<SearchListVO> searchKeyword(String keyword);
}
