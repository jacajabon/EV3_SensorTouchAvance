package com.exercices;

import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;

public class codeMotor {
	private static RegulatedMotor leftMotor;
	private static RegulatedMotor rightMotor;
	private final static int speedMotor = 720;
	private final static int accelerationMotor = 800;
	
	
	public   void motor(){
		leftMotor = Motor.A;
		rightMotor = Motor.C;
		leftMotor.setSpeed(speedMotor);
		rightMotor.setSpeed(speedMotor);
		leftMotor.setAcceleration(accelerationMotor);
		rightMotor.setAcceleration(accelerationMotor);
		leftMotor.resetTachoCount();
		rightMotor.resetTachoCount();
		leftMotor.rotateTo(0);
		rightMotor.rotateTo(0);

			leftMotor.forward();
			rightMotor.forward();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			leftMotor.stop(true);
			rightMotor.stop(true);

 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			;
		 
	}
}
