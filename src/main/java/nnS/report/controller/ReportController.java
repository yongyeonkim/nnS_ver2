package nnS.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController {

	@RequestMapping(value="/shop/goodsDetail/reportWriteForm")
	public ModelAndView reportWriteForm() throws Exception{
		ModelAndView mv = new ModelAndView("community/report/reportWriteForm");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsDetail/reportWrite")
	public ModelAndView reportWrite() throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/shop/goodsDetail");

		return mv;
	}
	
	@RequestMapping(value = "/myPage/reportList")	// 본인신고내역 리스트
	public ModelAndView myReportList() throws Exception {
		ModelAndView mv = new ModelAndView("community/report/reportList");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/reportList")
	public ModelAndView reportList() throws Exception {
		ModelAndView mv = new ModelAndView("community/report/reportList");
		
		return mv;		
	}

	@RequestMapping(value = "/community/reportDetail")
	public ModelAndView reportDetail() throws Exception {
		ModelAndView mv = new ModelAndView("community/report/reportDetail");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/reportDelete")
	public ModelAndView reportDelete() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/reportList");
		
		return mv;		
	}
	
	@RequestMapping(value = "/community/reportDetail/reportHandle")
	public ModelAndView reportHandle() throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/community/reportDetail");
		
		return mv;		
	}
	
	
}
