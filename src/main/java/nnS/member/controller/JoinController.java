package nnS.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import nnS.common.common.MailHandler;
import nnS.common.common.CommandMap;



@Controller
public class JoinController {

	@RequestMapping(value = "/joinForm") //회원가입 폼 
	public ModelAndView joinForm(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("member/join/joinForm");
		return mv;
	}
	
	@RequestMapping(value = "/join/idCheck")
	public @ResponseBody String idCheck(CommandMap commandMap) throws Exception {
		
		String idCheck = "1";
		
		return idCheck;
	}
	
	@RequestMapping(value = "/join/emailAuth", method = RequestMethod.POST)
	//회원가입 할 경우 해당 이메일 인증을 요구하는 링크를 첨부한 이메일을 발송
	public ModelAndView emailAuth(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("member/join/joinConfirm");
		//mybatis로 inserMeber() 기능 처리 및 해당 이메일로 이메일 발송
		
		return mv;
	}
	
	@RequestMapping(value = "/memberVerify", method = RequestMethod.GET)
	//member table에 verfiy컬럼의 값을 바꿔준다.
	public ModelAndView join(CommandMap commandMap) throws Exception {
		//이메일 인증기능 처리
		ModelAndView mv = new ModelAndView("member/join/welcome");
		
		return mv;
	}
	
	
	
}
