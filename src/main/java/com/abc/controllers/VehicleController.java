package com.abc.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.VehicleDto;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

	@PostMapping(value = "")
	public void createVehilce(@RequestBody VehicleDto vd) {
		System.out.println(vd.toString());
	}

}
