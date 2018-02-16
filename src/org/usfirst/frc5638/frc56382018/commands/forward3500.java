package org.usfirst.frc5638.frc56382018.commands;

import org.usfirst.frc5638.frc56382018.Robot;
import org.usfirst.frc5638.frc56382018.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class forward3500 extends Command {

    public forward3500() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.drivePos(-3500, 3500);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(RobotMap.driveTrainTalonSRXright.getSelectedSensorPosition(0) >= 3000) {
        	return true;
        }else{
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
