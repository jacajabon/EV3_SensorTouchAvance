package com.exercices;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class SensorIR {
	/**
	 * SENSOR IR
	 */
	private static SampleProvider sampler;


	
	static void initialize() {
		Port port = LocalEV3.get().getPort("S4");
		@SuppressWarnings("resource")
		SensorModes sensor = new EV3IRSensor(port);

		sampler = sensor.getMode("Distance");
	}
	
	public void getDistance(String Color){
 		float[] sample = new float[sampler.sampleSize()];	
			sampler.fetchSample(sample, 0);
			System.out.println("Dist: " + sample[0] +" de " +Color);
			Delay.msDelay(2000);		
 	}
	
}
