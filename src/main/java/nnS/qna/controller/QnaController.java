package nnS.qna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QnaController {

	@RequestMapping(value = "/myPage/qnaList")
	public ModelAndView myQnaList() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaList");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaList")
	public ModelAndView qnaList() throws Exception {
		ModelAndView mv = new ModelAndView("/community/qna/qnaList");
		
		return mv;		
	}

	@RequestMapping(value = "/community/qnaDetail")
	public ModelAndView qnaDetail() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaWriteForm")
	public ModelAndView qnaWriteForm() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaWriteForm");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaWrite")
	public ModelAndView qnaWrite() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/qnaDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaModifyForm")
	public ModelAndView qnaModifyForm() throws Exception {
		ModelAndView mv = new ModelAndView("community/qna/qnaWriteForm");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaModify")
	public ModelAndView qnaModify() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/qnaDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaDelete")
	public ModelAndView qnaDelete() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/qnaList");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaDetail/answerWrite")
	public ModelAndView qnaAnswerWrite() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/qnaDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/qnaDetail/answerDelete")
	public ModelAndView qnaAnswerDelete() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/qnaDetail");
		
		return mv;		
	}
	
}
