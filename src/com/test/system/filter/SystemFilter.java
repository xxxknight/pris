package com.test.system.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 系统过滤器
 *
 */
public class SystemFilter implements Filter{
	/**
	 */
	public static Map<String,String> noWAllowLoginUrlsMap;

	public static Map<String,String> noGAllowLoginUrlsMap;
	
	/**
	 * url特殊字符过滤
	 */
	public static String[] illegalChars;
	
	static{
		noWAllowLoginUrlsMap = new HashMap<String, String>();
		noWAllowLoginUrlsMap.put("/admin/arrange.jsp","");
		noWAllowLoginUrlsMap.put("/admin/index.jsp","");
		
		noGAllowLoginUrlsMap = new HashMap<String, String>();
		illegalChars = new String[]{
			"$","CR","LF","http","insert","update","delete","select"
		};
	}
	/**
	 * 销毁
	 */
	public void destroy() {
	}

	/**
	 * 拦截
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		req.setCharacterEncoding("utf-8");
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(url);
		HttpSession session = req.getSession();
		Object currenUser = session.getAttribute("username"); /* 当前用户名 */
		if(url.startsWith("/resources")||url.startsWith("/register")){ //  素材允许访问
			chain.doFilter(req, res);
			return;
		}
		
		if(url.startsWith("/errop.jsp")){ //  素材允许访问
			chain.doFilter(req, res);
			return;
		}
		
		Enumeration params = req.getParameterNames();
		while(params.hasMoreElements()){
			String paramName = (String) params.nextElement();
			String[] paramValues = req.getParameterValues(paramName);
			for(int i=0;i<paramValues.length;i++){
				for(int j=0;j<illegalChars.length;j++){
					if(paramValues[i].indexOf(illegalChars[j])!=-1){
						out(req, res); // 客户端提示
						return;
					}
				}
			}
		}
		
		if(noWAllowLoginUrlsMap.containsKey(url)){
			if (currenUser == null||!ActiveUser.getInstance().exist(currenUser.toString())) {
				sessionTimeout(req,res,"admin/login.jsp"); // 客户端提示
				return ;
			}else{
				chain.doFilter(req, res);
				return;
			}
		}
		
		if(noGAllowLoginUrlsMap.containsKey(url)){
			if (currenUser == null||!ActiveUser.getInstance().exist(currenUser.toString())) {
				sessionTimeout(req,res,"admin/login.jsp"); // 客户端提示
				return ;
			}else{
				chain.doFilter(req, res);
				return;
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * 初始化
	 */
	public void init(FilterConfig arg0) throws ServletException {
	}
	/**
	 * 会话超时
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	private void sessionTimeout(HttpServletRequest req, HttpServletResponse res,String url) throws IOException{
		req.getSession().invalidate();
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<script language=JavaScript>");
		out.println("alert(\"您尚未登录,请登录！\")");
		out.println("top.location.href=\""+req.getContextPath()+"/"+url+"\";");
		out.println("</script>");
		out.flush();
		out.close();
	}
	/**
	 * 非法登录
	 * @param req
	 * @param res
	 * @throws IOException
	 */
	private void out(HttpServletRequest req, HttpServletResponse res) throws IOException{
		req.getSession().invalidate();
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<script language=JavaScript>");
		out.println("alert(\"请求异常!\")");
		out.println("top.location.href=\""+req.getContextPath()+"/\";");
		out.println("</script>");
		out.flush();
		out.close();
	}
	
}
