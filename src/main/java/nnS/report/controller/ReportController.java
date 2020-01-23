package nnS.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController {

	@RequestMapping(value="/shop/goodsDetail/reportWrite")
	public ModelAndView reportWrite() throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/shop/goodsDetail");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsDetail/reportDelete")
	public ModelAndView reportDelete() throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/shop/goodsDetail");

		return mv;
	}
	
	@RequestMapping(value = "/myPage/reportList")	// 본인신고내역 리스트
	public ModelAndView reportList() throws Exception {
		ModelAndView mv = new ModelAndView("community/report/reportList");
		
		return mv;		
	}
	
	@RequestMapping(value = "/myPage/reportDetial")
	public ModelAndView reportDetail() throws Exception {
		ModelAndView mv = new ModelAndView("community/report/reportDetail");
		
		return mv;		
	}
	
	
	
}
