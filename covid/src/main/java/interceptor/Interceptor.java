package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("user");
		System.out.println("interceptor 시작");
		
		if(obj == null) {
			response.sendRedirect("loginpage.do");
			System.out.println("obj"+obj);
			return false;
		}
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception{
		System.out.println("interceptor 끝");
	}
	
}
