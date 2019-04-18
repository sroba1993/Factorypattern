package com.sroba;

import com.sroba.vehiclefactory.IVehicleFactory;
import com.sroba.vehiclefactory.impl.AutobusFactory;
import com.sroba.vehiclefactory.impl.EmptyFactory;
import com.sroba.vehiclefactory.impl.MotorcycleFactory;
import com.sroba.vehiclefactory.impl.ParticularCarFactory;

public class Factory {

	public IVehicleFactory getVehcile(String licensePlate, String vehicleType, String mark, int model, 
			int cylinder, String color) {
		if (vehicleType == null) {
			return new EmptyFactory();
		} else if (vehicleType.equalsIgnoreCase("carroparticular")) {
			return new ParticularCarFactory(licensePlate, mark, model, cylinder, color);
		} else if (vehicleType.equalsIgnoreCase("moto")) {
			return new MotorcycleFactory(licensePlate, mark, model, cylinder, color);
		} else if (vehicleType.equalsIgnoreCase("autobus")) {
			return new AutobusFactory(licensePlate, mark, model, cylinder, color);
		}
		return new EmptyFactory();
	}
}
