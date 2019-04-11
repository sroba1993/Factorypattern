package com.sroba;

import com.sroba.vehiclefactory.IVehicleFactory;
import com.sroba.vehiclefactory.impl.FactoryAutobus;
import com.sroba.vehiclefactory.impl.FactoryEmpty;
import com.sroba.vehiclefactory.impl.FactoryMotorcycle;
import com.sroba.vehiclefactory.impl.FactoryParticularCar;

public class Factory {

	public IVehicleFactory getVehcile(String licensePlate, String vehicleType, String mark, int model, 
			int cylinder, String color) {
		if (vehicleType == null) {
			return new FactoryEmpty();
		} else if (vehicleType.equalsIgnoreCase("carroparticular")) {
			return new FactoryParticularCar(licensePlate, mark, model, cylinder, color);
		} else if (vehicleType.equalsIgnoreCase("moto")) {
			return new FactoryMotorcycle(licensePlate, mark, model, cylinder, color);
		} else if (vehicleType.equalsIgnoreCase("autobus")) {
			return new FactoryAutobus(licensePlate, mark, model, cylinder, color);
		}
		return new FactoryEmpty();
	}
}
