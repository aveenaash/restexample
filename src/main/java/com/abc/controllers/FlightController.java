package com.abc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@RequestMapping(value="/sample", method= RequestMethod.GET)
	public void sampleParam(@RequestParam String name, 
			@RequestParam Integer id, @RequestParam boolean isDelayed) {
		System.out.println("Name : " + name);
		System.out.println("id : " + id);
		System.out.println("isDelayed : " + isDelayed);
	}
	
	@RequestMapping(value="/{id}/sample", method= RequestMethod.GET)
	public void samplePathAndParam(@PathVariable Integer id,
			@RequestParam String name, 
			 @RequestParam boolean isDelayed) {
		System.out.println("Name : " + name);
		System.out.println("id : " + id);
		System.out.println("isDelayed : " + isDelayed);
	}
	
	
}
