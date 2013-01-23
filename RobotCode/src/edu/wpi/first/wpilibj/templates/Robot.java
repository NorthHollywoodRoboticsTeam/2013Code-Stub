package edu.wpi.first.wpilibj.templates;

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
    
}