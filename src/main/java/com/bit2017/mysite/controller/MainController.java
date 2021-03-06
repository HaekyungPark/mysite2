package com.bit2017.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping( "/main" )
	public String main(){
		System.out.println( "hello!!" );
		return "main/index";
	}
	
	@ResponseBody
	@RequestMapping( "/hello" )
	public String hello() {
		return "<h1>안녕하세요</h1>";
	}
}
