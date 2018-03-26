package org.usfirst.frc5638.frc56382018.commands;



import org.usfirst.frc5638.frc56382018.Robot;
import org.usfirst.frc5638.frc56382018.subsystems.variables;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightAuto extends CommandGroup {
	
	

    public RightAuto() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	//addSequential(new resetDumpPos());
    	//addSequential(new resetDrivePos());
    	//addSequential(new drivePos1());
    	//addSequential(new resetDrivePos());
    	//addSequential(new rightTurn());
    	//addSequential(new resetDrivePos());
    	//addSequential(new driveForward());
    	//addSequential(new resetDrivePos());
    	//addSequential(new leftTurn());
    	//addSequential(new resetDrivePos());
    	//addSequential(new drivePos1());
    	//addSequential(new dumpInCom());
    	//addSequential(new dumpOutCom());
		  if(Robot.variables.right = true) {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
			  addSequential(new forwardtime(3));
			  addSequential(new stopCom());
			  addSequential(new leftTurn(1.35));
			  addSequential(new forwardtime(.25));
			  addSequential(new stopCom());
			  addSequential(new dumpOutCom());
			  addSequential(new dumpInCom());
		  } else {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
			  addSequential(new forwardtime(.5));//3
			  //addSequential(new stopCom());
			  //addSequential(new leftTurn(4));
			  //addSequential(new stopCom());
			  addSequential(new forwardtime(3.5));
			  //addSequential(new stopCom());
			  //addSequential(new rightTurn(1.75));
			  //addSequential(new stopCom());
			  addSequential(new forwardtime(1));
			  //addSequential(new stopCom());
			  //addSequential(new stopCom());
			  //addSequential(new dumpOutCom());
			  //addSequential(new dumpInCom());
			  addSequential(new stopCom());
		  }
       }
    }
