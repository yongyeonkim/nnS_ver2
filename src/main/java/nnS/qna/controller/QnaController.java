package nnS.qna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QnaController {

	@RequestMapping(value = "/myPage/qnaList")
	public ModelAndView qnaList() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaList");
		
		return mv;		
	}

	@RequestMapping(value = "/myPage/qnaDetail")
	public ModelAndView qnaDetail() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/myPage/qnaDelete")
	public ModelAndView qnaDelete() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaDelete");
		
		return mv;		
	}
	
}
