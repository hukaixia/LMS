package jmu.hw.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession ses = req.getSession();
        String path = req.getServletPath();
        String []str = path.split("\\.");
        int ans = str.length;
        String pp="";
        if(ans-1>=0)
        	pp= str[ans-1];
        if("js".equals(pp)||"css".equals(pp)||"jpg".equals(pp)||"/reader/login".equals(req.getServletPath())||"/sendEmailForPswd".equals(req.getServletPath())
        		||"/login".equals(req.getServletPath())
        		||"/admin/login".equals(req.getServletPath())
        		|| ses.getAttribute("loginReader") != null
				|| ses.getAttribute("loginAdmin") != null){
        	chain.doFilter(req, response);
        }else {
			req.getRequestDispatcher("/login").forward(req, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
