package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.SpeedController;

public class DriveTrain {
    
    private SpeedController left, right;
    
    public DriveTrain(SpeedController left, SpeedController right) {
	
    }
    
    public void drive(double linear, double rotational) {//copy pasta from last year
	double leftValue, rightValue;
		double max;
		
		//Adjusts sensitivity of the linear and rotational values
		linear *= Settings.LINEAR_MOTION_SENSITIVITY;
		rotational *= Settings.ROTATIONAL_MOTION_SENSITIVITY;
		
		
		leftValue = linear + rotational;
		rightValue = linear - rotational;
		
		/* If the absolute value of leftValue or rightValue is greater than 1
		 * then both values are reproportioned with respect to the larger of the
		 * two values
		 */
		max = Math.abs(leftValue);
		if(max < Math.abs(rightValue))
			max = Math.abs(rightValue);
		
		if(max > 1){
			leftValue  /= max;
			rightValue /= max;
		}
		
		left.set(leftValue);
		right.set(rightValue);
    }
    
}