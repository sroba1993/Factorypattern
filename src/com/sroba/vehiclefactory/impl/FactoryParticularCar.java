package com.sroba.vehiclefactory.impl;

import com.sroba.vehiclefactory.IVehicleFactory;

public class FactoryParticularCar implements IVehicleFactory{
	
	private String licensePlate ;
	private String vehicleType;
	private String mark;	
	private int model;
	private int cylinder;
	private String color;
	
	
	public FactoryParticularCar(String licensePlate, String mark, int model, int cylinder, String color) {
		this.licensePlate = licensePlate;
		this.vehicleType = "ParticularCar";
		this.mark = mark;
		this.model = model;
		this.cylinder = cylinder;
		this.color = color;
	}


	@Override
	public void makeVehicle() {
		System.out.println("Carro particular fabricado");
	}


	@Override
	public String toString() {
		return "factoryCar [licensePlate= " + licensePlate + ", vehicleType= " + vehicleType + ", mark= " + mark
				+ ", model= " + model + ", cylinder= " + cylinder + ", color= " + color + "]";
	}

}