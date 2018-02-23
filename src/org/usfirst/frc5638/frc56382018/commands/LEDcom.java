package org.usfirst.frc5638.frc56382018.commands;

import org.usfirst.frc5638.frc56382018.Robot;
import org.usfirst.frc5638.frc56382018.RobotMap;
import org.usfirst.frc5638.frc56382018.subsystems.LEDsub;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LEDcom extends Command {

    public LEDcom() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.LEDsub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute(DriverStation.Alliance color) {
    	color = DriverStation.getInstance().getAlliance();
    	if(RobotState.isEnabled() && color == DriverStation.Alliance.Blue) {
    		LEDsub.color(-.83);
    	}else if(RobotState.isDisabled() && color == DriverStation.Alliance.Blue) {
    		LEDsub.color(-.09);
    	}else if(RobotState.isDisabled() && color == DriverStation.Alliance.Red) {
    		LEDsub.color(-.11);
    	}else if(RobotState.isEnabled() && color == DriverStation.Alliance.Red) {
    		LEDsub.color(-.85);
    	}else if(RobotState.isDisabled()) {
    		LEDsub.color(-.77);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
