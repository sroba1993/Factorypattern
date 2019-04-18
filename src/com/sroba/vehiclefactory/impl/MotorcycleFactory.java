package com.sroba.vehiclefactory.impl;

import com.sroba.vehiclefactory.IVehicleFactory;

public class MotorcycleFactory implements IVehicleFactory{

	private String licensePlate ;
	private String vehicleType;
	private String mark;	
	private int model;
	private int cylinder;
	private String color;
	

	public MotorcycleFactory(String licensePlate, String mark, int model, int cylinder,
			String color) {
		this.licensePlate = licensePlate;
		this.vehicleType = "Motocyrcle";
		this.mark = mark;
		this.model = model;
		this.cylinder = cylinder;
		this.color = color;
	}


	@Override
	public void makeVehicle() {
		System.out.println("Moto fabricada");		
	}


	@Override
	public String toString() {
		return "License Plate= " + licensePlate + ", vehicle Type= " + vehicleType + ", mark= " + mark
				+ ", model= " + model + ", cylinder= " + cylinder + ", color= " + color;
	}		
}
