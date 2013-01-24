package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.Jaguar;

public class Robot {
    private static Robot instance = new Robot();
    public static Robot getRobot() {
	return instance;
    }
    
    
    public Robot() {
	driveTrain = new DriveTrain(new Jaguar(Settings.MOTOR_LEFT), new Jaguar(Settings.MOTOR_RIGHT));
    }
    
    private DriveTrain driveTrain;
    
    public DriveTrain getDriveTrain() {
	return driveTrain;
    }
    
    private DriverStationLCD lcd = DriverStationLCD.getInstance();
    public void printlnToLCD(String text) {
	lcd.println(DriverStationLCD.Line.kMain6, 1, text);
        lcd.updateLCD();
    }
    
}