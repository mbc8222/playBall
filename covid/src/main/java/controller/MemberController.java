package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import service.MemberServiceImpl;
import vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	MemberServiceImpl service;

	//로그인페이지 이동
	@RequestMapping(value="loginpage.do", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loginpage() {
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("Login");
		return mv;
	}
	
	//회원가입페이지 이동
	@RequestMapping(value="create.do", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView createzone() {
		ModelAndView mv=new ModelAndView();
			
		mv.setViewName("Create");
		return mv;
	}
		
	//회원가입
	@RequestMapping(value="membercreate.do", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView membercreate(MemberVo vo) {
		ModelAndView mv=new ModelAndView();
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println(vo.getPassword());
		System.out.println(vo.getPhone());
		int result=service.idcheck(vo.getId());
		if(result==0) {
			service.create(vo);	
			mv.setViewName("Main");
		}else {
			//mv.addObject("vo", vo);
			//mv.setViewName("Create");
			
		}
		return mv;
	}
	
	//아이디중복체크
	@ResponseBody
	@RequestMapping(value="idcheck.do", method= {RequestMethod.POST,RequestMethod.GET})
	public String idcheck(@RequestParam("id") String id) {
		ModelAndView mv=new ModelAndView();
		System.out.println(id);
		String result=Integer.toString(service.idcheck(id));
		return result;
	}
	
	
	//로그인
	@RequestMapping(value="login.do", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login(MemberVo vo, HttpSession session) {
		ModelAndView mv=new ModelAndView();
		MemberVo login=service.login(vo);
		System.out.println("conlogin1"+vo.getId());
		System.out.println("conlogin2"+vo.getPassword());
		System.out.println("intercont1");
		if(session.getAttribute("user") != null) {
			session.removeAttribute("user");
		}
		
		if(login != null) {
			session.setAttribute("user", login);
			System.out.println("intercont2");
			mv.addObject("user", login);
			mv.setViewName("Main");
		}else {
			System.out.println("intercont3");
			mv.setViewName("Main");
		}
		return mv;
	}
	
	//로그아웃
	@RequestMapping(value="logout.do", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView logout(HttpSession session) {
		ModelAndView mv=new ModelAndView();
		
		session.invalidate();
		mv.setViewName("Main");
		return mv;
	}
}
