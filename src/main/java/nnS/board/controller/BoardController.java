package nnS.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/community/boardList")
	public ModelAndView boardList() throws Exception {
		ModelAndView mv = new ModelAndView("/community/board/boardList");
		
		return mv;		
	}

	@RequestMapping(value = "/community/boardDetail")
	public ModelAndView boardDetail() throws Exception {
		ModelAndView mv = new ModelAndView("community/board/boardDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/boardWriteForm")
	public ModelAndView boardWriteForm() throws Exception {
		ModelAndView mv = new ModelAndView("community/board/boardWriteForm");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/boardWrite")
	public ModelAndView boardWrite() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/boardDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/boardModifyForm")
	public ModelAndView boardModifyForm() throws Exception {
		ModelAndView mv = new ModelAndView("community/board/boardWriteForm");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/boardModify")
	public ModelAndView boardModify() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/boardDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/boardDelete")
	public ModelAndView boardDelete() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/boardList");
		
		return mv;		
	}

}
