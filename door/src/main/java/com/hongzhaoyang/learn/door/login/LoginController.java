/**
 * 
 */
package com.hongzhaoyang.learn.door.login;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author redSun
 * 2018年9月9日下午4:09:31
 *	登录相关的controller
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired RedisTemplate template;
	
	@GetMapping("/login")
	public String login() {
		logger.info("this is also a test");
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("uid")String uid,
			@RequestParam("password")String password,
			@RequestParam("backUrl")String backUrl) {
		logger.info("当前登录用户:{}和密码:{},成功地址",uid,password,backUrl);
		template.opsForValue().set("uid",uid,100, TimeUnit.SECONDS);
		return "redirect:"+backUrl;
		
	//	return "login";
		
	}
	

}
