package org.usfirst.frc5638.frc56382018.subsystems;

import org.usfirst.frc5638.frc56382018.RobotMap;
import org.usfirst.frc5638.frc56382018.commands.LEDcom;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LEDsub extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final static Spark LEDcontroller = RobotMap.LEDcontroller;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new LEDcom());
    }
    public static void color(double color){
    	LEDcontroller.set(color);
    }
}

