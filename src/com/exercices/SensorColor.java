package com.exercices;

import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
/**
 * 
 * @author erwin
 *
 */
public class SensorColor extends Thread {
	  SensorIR sir = new SensorIR();
	
	/**
	 * sensor color
	 */
	public static final int RED = 0;    
     public static final int YELLOW = 3;
	private EV3ColorSensor colorSensor;
	
	 public SensorColor(final EV3ColorSensor colorSensor) {
	        this.colorSensor = colorSensor;
	  }
	 
	  /**
	   * funcion para leer los colores
	   */
	   public void run() {
		   while (!Button.ESCAPE.isDown()) {
	            final int colorId = colorSensor.getColorID();
	            switch (colorId){
	                //RED
	                case 0:
	                    Button.LEDPattern(2);	                    
	                    sir.getDistance("Rojo");
	                    break;	               	                 
 	                case 3:
	                    Button.LEDPattern(3);
	                    sir.getDistance("Amarillo");	                    
	                    break;
	                default:	                	 
	            }
	        }
	    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SensorIR.initialize();
 		
		/**
		 * Sensor Color
		 */
		final EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S2);        
        final SensorColor sc = new SensorColor(colorSensor);

        sc.start();
        Button.waitForAnyPress();		
	}
	 
}
