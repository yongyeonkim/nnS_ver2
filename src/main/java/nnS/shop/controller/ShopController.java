package nnS.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

	@RequestMapping(value="/shop")
	public ModelAndView shopMain() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsList");

		return mv;
	}
	
	@RequestMapping(value="/shop/allGoodsList")
	public ModelAndView shopAllGoodsList() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsList");

		return mv;
	}
	
	@RequestMapping(value="/shop/likeGoodsList")
	public ModelAndView shopLikeGoodsList() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsList");

		return mv;
	}
	
	@RequestMapping(value="/shop/newGoodsList")
	public ModelAndView shopNewGoodsList() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsList");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsWriteForm")
	public ModelAndView goodsWriteForm() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsWriteForm");

		return mv;
	}

	@RequestMapping(value="/shop/goodsWrite")
	public ModelAndView goodsWrite() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsWriteResult");

		return mv;
	}

	@RequestMapping(value="/shop/goodsModifyForm")
	public ModelAndView goodsModifyForm() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsWriteForm");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsModify")
	public ModelAndView goodsModify() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsWriteResult");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsDelete")
	public ModelAndView goodsDelete() throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/shop/allgoodsList");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsDetail")
	public ModelAndView goodsDetail() throws Exception{
		ModelAndView mv = new ModelAndView("/shop/goods/goodsDetail");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsDetail/goodsLike")
	public ModelAndView goodsLike() throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/shop/goodsDetail");

		return mv;
	}
	
	@RequestMapping(value="/shop/goodsDetail/goodsUnlike")
	public ModelAndView goodsUnlike() throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/shop/goodsDetail");

		return mv;
	}
}
