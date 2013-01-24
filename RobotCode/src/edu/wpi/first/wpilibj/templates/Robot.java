package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DriverStationLCD;

public class Robot {
    private static Robot instance = new Robot();
    public static Robot getRobot() {
	return instance;
    }
    
    
    public Robot() {
	driveTrain = new DriveTrain(null, null);
    }
    
    private DriveTrain driveTrain;
    
    public DriveTrain getDriveTrain() {
	return driveTrain;
    }
    
    
    
    /*public void printToLCD(String text) {
        
    
    }*/
    
    public void printBlockToLCD(String text) {
        
    
    	
    
    }
    private DriverStationLCD lcd = DriverStationLCD.getInstance();
    private String textOnScreen = "";
    int lineCount = 0;
    public void printlnToLCD(String text) {
        textOnScreen = textOnScreen + text;
        lineCount++;
        if ()
    
    	
        printToLCD("\n" + text);
    }
    
}