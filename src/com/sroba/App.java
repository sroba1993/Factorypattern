package com.sroba;

import com.sroba.vehiclefactory.IVehicleFactory;

public class App {

	public static void main(String[] args) {
		Factory fabrica = new Factory();
		
		IVehicleFactory car = fabrica.getVehcile("xdp123", "carroparticular", "mazda", 2018, 1200, "rojo");
		car.makeVehicle();
		System.out.println(car.toString());
		
		IVehicleFactory motorcicle = fabrica.getVehcile("frt12a", "moto", "honda", 2018, 125, "amarilla");
		motorcicle.makeVehicle();
		System.out.println(motorcicle.toString());
		
		IVehicleFactory autobus = fabrica.getVehcile("frt12a", "autobus", "mazda", 2018, 1600, "amarilla");
		autobus.makeVehicle();
		System.out.println(autobus.toString());
		
	}
}
