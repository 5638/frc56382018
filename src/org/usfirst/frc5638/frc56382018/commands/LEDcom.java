package org.usfirst.frc5638.frc56382018.commands;

import org.usfirst.frc5638.frc56382018.Robot;
import org.usfirst.frc5638.frc56382018.subsystems.LEDsub;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.command.Command;

public class LEDcom extends Command {

    public LEDcom() {
    	requires(Robot.LEDsub);
    }

    protected void initialize() {
    }

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

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
