package com.bbl.service;

import com.bbl.domain.user.EmailVO;
import com.bbl.domain.user.SearchListVO;
import com.bbl.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/*
	* 회원가입 유무 체크 */
	@Override
	public String checkResister(EmailVO emailVO) {
		if (userRepository.checkResister(emailVO)) {
			return "signedup";
		} else {
			return "nousersignedup";
		}
	}

	/*
	 * 검색
	 * 페이징 필요
	 * */
	@Override
	public List<SearchListVO> searchKeyword(String keyword) {
		System.out.println();
		return userRepository.searchKeyword(keyword);
	}







	/*
	 * 테스트
	 * */
	/*public void insertTest(String str) {
		userRepository.insertTest(str);
	}
*/
}
