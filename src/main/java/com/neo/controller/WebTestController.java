package com.neo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neo.domain.Person;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/webTest")
public class WebTestController {

	@ApiOperation(value = "测试", httpMethod = "GET", response = String.class, notes = "just for ttest")
	@RequestMapping(value = "/getNowTime", method = RequestMethod.GET)
	public String getNowTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	@ApiOperation(value = "获取我的信息", httpMethod = "GET", response = Person.class, notes = "获取我的信息notes")
	@RequestMapping(value = "/getPerson", method = RequestMethod.GET)
	public Person getPerson() {
		Person person = new Person();
		person.setName("neo");
		person.setAge(29);
		return person;
	}

}
