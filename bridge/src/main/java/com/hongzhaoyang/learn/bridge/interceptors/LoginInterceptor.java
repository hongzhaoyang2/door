/**
 * 
 */
package com.hongzhaoyang.learn.bridge.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hongzhaoyang.learn.common.HttpUtil;
import com.hongzhaoyang.learn.common.UserUtils;

/**
 * @author redSun
 * 2018年9月9日下午6:40:35
 *	登录拦截器 防止非法访问
 */
@Service
public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	@Autowired RedisTemplate template;
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		logger.info("拦截器起效果了");
		//去除请求地址
		String url = request.getRequestURI();
		//如果是退出请求，直接退出
		
		//如果是白名单，则直接return true
		
		//查看session
		String userName = (String) template.opsForValue().get("uid");
		if(StringUtils.hasLength(userName)) {
			logger.info("不需要再次登录");
			UserUtils.setCurrentUid(userName);
			return true;
		}
		
		
		
		
		
		
		response.sendRedirect("http://localhost:8081/door/login/login?backUrl="+toBackUrl(request));
		return false;
	}
	
	 public String toBackUrl(HttpServletRequest request){

	        String back = "";
	        if (HttpUtil.isAjax(request) ) {
	            return request.getHeader("referer");
	        }else{
	            back = request.getRequestURL().toString();
	            if (request.getQueryString() != null && request.getQueryString().length()!=0) {
	                back+="?" + request.getQueryString();
	            }
	        }
	        return HttpUtil.encodeURL(back);
	    }
	
}
