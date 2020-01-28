package nnS.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticeController {
	
	@RequestMapping(value = "/community/noticeList")
	public ModelAndView noticeList() throws Exception {
		ModelAndView mv = new ModelAndView("/community/notice/noticeList");
		
		return mv;		
	}

	@RequestMapping(value = "/community/noticeDetail")
	public ModelAndView noticeDetail() throws Exception {
		ModelAndView mv = new ModelAndView("community/notice/noticeDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/noticeWriteForm")
	public ModelAndView noticeWriteForm() throws Exception {
		ModelAndView mv = new ModelAndView("community/notice/noticeWriteForm");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/noticeWrite")
	public ModelAndView noticeWrite() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/noticeDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/noticeModifyForm")
	public ModelAndView noticeModifyForm() throws Exception {
		ModelAndView mv = new ModelAndView("community/notice/noticeWriteForm");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/noticeModify")
	public ModelAndView noticeModify() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/noticeDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/noticeDelete")
	public ModelAndView noticeDelete() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/noticeList");
		
		return mv;		
	}

}
