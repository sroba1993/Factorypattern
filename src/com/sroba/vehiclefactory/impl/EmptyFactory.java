package com.sroba.vehiclefactory.impl;

import com.sroba.vehiclefactory.IVehicleFactory;

public class EmptyFactory implements IVehicleFactory{

	@Override
	public void makeVehicle() {
		System.out.println("No ha introducido un tipo de vehículo válido");	
	}
}
