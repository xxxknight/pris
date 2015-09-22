package com.test.system.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	private static List<String> openURLs;

	static {
		openURLs = new ArrayList<String>();
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String url = req.getRequestURI().substring(
				req.getContextPath().length());
		System.out.println(url);
		System.out.println(openURLs);
		if (openURLs.contains(url)) {
			System.out.println("hehe");
			chain.doFilter(request, response);
		}
		System.out.println("12344");
		HttpSession session = req.getSession(true);
		Boolean flag = (Boolean) session.getAttribute("flag");
		String root = req.getContextPath();

		if (flag == null || flag == false) {
			res.sendRedirect(root + "/login.jsp");
		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {

	}
}
