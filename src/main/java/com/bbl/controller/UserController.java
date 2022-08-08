package com.bbl.controller;

import com.bbl.domain.user.*;
import com.bbl.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/user/*")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}


	/*
	* SNS 로그인
	* 회원가입 유무 체크 */
	@PostMapping("/checkResister")
	@ResponseBody
	public A_messageVO CheckResisterPOST(@RequestBody EmailVO emailVO) {
		logger.info("CheckResisterPOST 시작");
		logger.info("emailVO -> " + emailVO);
		logger.info("CheckResisterPOST 끝( DB갔다가 리턴 )");

		return new A_messageVO(userService.checkResister(emailVO));
	}


	/*
	 * SNS 로그인
	 * 로그인
	 * */
	@PostMapping("/SNSLogin")
	@ResponseBody
	public A_messageVO SNSLoginPOST() {
		// service 필요 messageVO 생성자로 들어가도됨
		// 로그인 완료후 유저index 리턴
		return new A_messageVO("");
	}

	/*
	 * SNS 로그인
	 * 회원가입
	 * - 닉네임
	 * */
	@PostMapping("/SNSResister")
	@ResponseBody
	public A_messageVO SNSResisterPOST() {
		// service 필요 messageVO 생성자로 들어가도됨
		// 회원가입 완료후 유저index 리턴
		return new A_messageVO("success");
	}


	/*
	 * 메인
	 * - 검색, 알림
	 * - 유저의 관심사별 메인 콘텐츠 상이함
	 * - 광고배너
	 * - hotpick pick = new hotpick[4];
	 * - 톡톡 real 후기 = new 후기[3];
	 * - 건강한 몸매를 갖고싶다면? ( gym, 트레이너 노출 )
	 * -
	 * */
	@PostMapping("/main")
	@ResponseBody
	public MainVO mainPOST(String korean) {

		return new MainVO();
		/*
		* MainVO 객체 생성필요
		* */
	}


	/*
	* 검색
	*
	* 페이징 필요
	* 키워드 'ㅁㅁ+ㅁㅁ+ㅁㅁ'
  * 띄어쓰기 나눠서 DB에서 검색할지 결정해야함
	* */
	@GetMapping("/search")
	@ResponseBody
	public List<SearchListVO> search(@RequestParam(value="keyword") String keyword, Model model) {
		return userService.searchKeyword(keyword);
	}


	/*
	* 마이페이지
	* */
	@PostMapping("/mypage/main")
	@ResponseBody
	public MyPageVO mypagemainPOST() {

		// 닉네임 포인트, 로그인타입, 본인인증여부

	return new MyPageVO();
	}

	/*
	* 닉네임변경
	* */
	@PostMapping("/mypage/changeNickname")
	@ResponseBody
	public A_messageVO mypageChangeNicknamePOST() {
		// 아래 조건문으로 return
		// seccess, fail ?
		if (false) {

			return new A_messageVO("");
		} else {

			return new A_messageVO("");
		}
	}


	/*
	 * 비밀번호 변경
	 * */
	@PostMapping("/mypage/changePassword")
	@ResponseBody
	public A_messageVO mypageChangePasswordPOST() {
		return new A_messageVO("");
	}

	/*
	* 회원탈퇴 트랜잭셔널 날짜 기록
	* BBL측의 기록정책이나 뭐 그런거 참고 필요
	*
	*
	* */


public void makePasswor() {

}



















































	/*
	 * - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트
	 * - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트
	 * - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트
	 * - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트
	 * - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트 - 테스트
	 * */
/*
	@PostMapping("/insertTest")
	public void insertTest(@RequestParam String str) {
		userService.insertTest(str);
	}*/

	@PostMapping("/modelTest")
	@ResponseBody
	public String modelTest() {
		logger.info("asdfasdf");
		logger.debug("qqqqqq");
		logger.warn("asdfasaaaaaaaaa");
		logger.error("sssssssssssssssssssssssssss");
		System.out.println("qqqqqqqqqqqqqqqqqqq");
		System.out.println();

		return "test";
	}
}