package nnS.myPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import nnS.common.common.CommandMap;

@Controller
public class MyPageController {

	@RequestMapping(value = "/myPage") // 비밀번호 찾기 폼을 보여주는 메소드
	public ModelAndView pwCheck(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("member/myPage/pwCheckForm");
		return mv;
	}
	
	@RequestMapping(value = "/myPage/accountModifyForm") 
	public ModelAndView accountModifyForm(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("member/myPage/accountModifyForm");
		return mv;
	}
	
	@RequestMapping(value = "/myPage/emailAuth") 
	public ModelAndView emailAuth(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("member/myPage/joinConfirm");
		return mv;
	}
	
	@RequestMapping(value = "/myPage/pwModifyForm") 
	public ModelAndView pwModifyForm(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("member/myPage/pwModifyForm");
		return mv;
	}
	
	@RequestMapping(value = "/myPage/modify") 
	public ModelAndView accountModify(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/member/main/main");
		return mv;
	}
	
	@RequestMapping(value = "/myPage/myInfoDelete") 
	public ModelAndView accountDelete(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/member/main/main");
		return mv;
	}
	
	
	
}
