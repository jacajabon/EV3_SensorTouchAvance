package com.exercices;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
public class SensorTouch {
	
	static codeMotor cm = new codeMotor();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S1);

		LCD.clear();
		
		while (!Button.ESCAPE.isDown()) {
			int sampleSize = touch.sampleSize();
			float[] sample = new float[sampleSize];
			touch.fetchSample(sample, 0);
	       // LCD.drawString("TS: " + sample[0], 0, 0);
			System.out.println("Estado : " + sample[0]);
			if(sample[0]==1){
				//Sound.beepSequence();
				cm.motor();
				Thread.sleep(20);
			}
			
			
	    }
	}


}
