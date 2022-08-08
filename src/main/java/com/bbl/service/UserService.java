package com.bbl.service;

import com.bbl.domain.user.EmailVO;
import com.bbl.domain.user.SearchListVO;

import java.util.List;

public interface UserService {

	/*
	* 회원가입 유무 체크 */
	String checkResister(EmailVO emailVO);

	/*
	 * 검색
	 * 페이징 필요
	 * */
	List<SearchListVO> searchKeyword(String keyword);
}
