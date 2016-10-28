package com.shelan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shelan.model.Exercise;

@Controller
public class MinusteController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		System.out.println("Exercise Minute:" + exercise.getMinutes());
		return "addMinutes";
	}
	
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
//		System.out.println("Exercising :" + exercise.getMinutes());
//		return "addMinutes";
//	}
}
