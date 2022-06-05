package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONPObject;

import service.NoticeServiceImpl;
import vo.NoticeVo;
import vo.PageVo;

@Controller
public class BoardController {

	@Autowired
	NoticeServiceImpl service;
	
	@RequestMapping(value="board.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView board(PageVo vo) {
		ModelAndView mv=new ModelAndView();
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		System.out.println("now"+vo.getNowPage());
		list=service.search(vo);
		mv.addObject("page",vo);
		mv.addObject("list", list);
		mv.setViewName("Board");						
		return mv;
	}
	
	@RequestMapping(value="mergetest.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView mergetest(PageVo vo) {
		ModelAndView mv=new ModelAndView();
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		System.out.println("now"+vo.getNowPage());
		list=service.search(vo);
		mv.addObject("page",vo);
		mv.addObject("list", list);
		mv.setViewName("Board");						
		return mv;
	}
	
	@RequestMapping(value="createzone.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView createzone() {
		ModelAndView mv=new ModelAndView();
		System.out.println("글쓰는페이지");
		mv.setViewName("BoardCreate");						
		return mv;
	}
	
	@RequestMapping(value="create.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView create(NoticeVo vo) {
		ModelAndView mv=new ModelAndView();
		service.create(vo);
		mv.setViewName("Board");						
		return mv;
	}
	
	@RequestMapping(value="detail.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView detail(NoticeVo vo) {
		ModelAndView mv=new ModelAndView();
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		list=service.detail(vo);
		mv.addObject("list", list);
		mv.setViewName("BoardDetail");						
		return mv;
	}
	
	@RequestMapping(value="modify.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView modify(NoticeVo vo) {
		ModelAndView mv=new ModelAndView();
		service.modify(vo);
		mv.setViewName("Board");						
		return mv;
	}
	
	@RequestMapping(value="delete.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView delete(NoticeVo vo) {
		ModelAndView mv=new ModelAndView();
		service.delete(vo);
		mv.setViewName("Board");						
		return mv;
	}
	
	@RequestMapping(value="jsontest.no", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView jsontest() {
		ModelAndView mv=new ModelAndView();
		Map<String, String> map=new LinkedHashMap<>();
		map.put("name1", "one");
		map.put("name2", "two");
		map.put("name3", "three");
		map.put("name4", "four");
		map.put("name5", "five");
		
		JSONPObject jo = new JSONPObject(map);
		
		mv.addObject("map", map);
		System.out.println(map);
		return mv;
	}
	
}
