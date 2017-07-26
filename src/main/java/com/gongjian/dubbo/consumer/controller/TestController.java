package com.gongjian.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gongjian.dubbo.remote.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/dubbo")
	public String test(@RequestParam(required = false, defaultValue = "world!") String name) {

		return testService.sayHello(name);

	}

}
