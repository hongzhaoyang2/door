/**
 * 
 */
package com.hongzhaoyang.learn.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author redSun
 * 2018年9月9日下午6:19:44
 *	登录欢迎界面
 */
@Controller
public class WelcomeController {
	private final static Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	

}
