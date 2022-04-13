package com.campus.myapp.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.campus.myapp.service.ReviewService;
import com.campus.myapp.service.memFavorService;
import com.campus.myapp.vo.ReviewVO;
import com.campus.myapp.vo.memFavorVO;

@RestController
@RequestMapping("/memFavor/*")
public class memFavorController {
	@Inject
	memFavorService service;
	
	// 마이페이지에서 리뷰목록 보기
	@GetMapping("memFavorList")
	public List<memFavorVO> memFavorList(memFavorVO vo, HttpSession session )	{
		vo.setUserid((String)session.getAttribute("logId"));
		List<memFavorVO> list = service.memFavorList(vo);
		return service.memFavorList(vo);
	}
	
}
