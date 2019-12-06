package com.abc.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class VehicleDto {

	@Min(value = 0)
	private int id;
	
	@NotNull(message = "make cannot be null")
	private String make;
	
	@NotNull(message = "model cannot be null")
	private String model;
	
	//@Max(value = 2020)
	private int year;
	private String vin;
	private String color;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", vin=" + vin
				+ ", color=" + color + "]";
	}
	
	

}
