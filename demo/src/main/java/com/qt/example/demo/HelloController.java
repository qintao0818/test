package com.qt.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author QinTao
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	private String hello() {
		return "hi,Stpring boot!";

	}
}
