package com.shelan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinusteController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(){
		return "addMinutes";
	}
}
