package org.usfirst.frc5638.frc56382018.commands;

import org.usfirst.frc5638.frc56382018.Robot;
import org.usfirst.frc5638.frc56382018.subsystems.variables;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CenterAuto extends CommandGroup {

    public CenterAuto() {
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
    	//Timer.delay(.1);
    	
		  System.out.println("im in center auto");
		  if(Robot.gamedata.charAt(0) == 'R') {
			  System.out.println("i should be driving");
			  addSequential(new forwardtime(.5));
			  addSequential(new stopCom());
			  addSequential(new rightTurn(2));
			  addSequential(new stopCom());
			  addSequential(new forwardtime(1));
			  addSequential(new stopCom());
			  addSequential(new leftTurn(1.75));
			  addSequential(new stopCom());
			  addSequential(new forwardtime(1));
			  addSequential(new stopCom());
			  addSequential(new stopCom());
			  addSequential(new dumpOutCom());
			  addSequential(new dumpInCom());
			  
		 }else if(Robot.gamedata.charAt(0) == 'L') {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
			  addSequential(new forwardtime(.5));
			  addSequential(new stopCom());
			  addSequential(new leftTurn(1.75));
			  addSequential(new stopCom());
			  addSequential(new forwardtime(1.5));
			  addSequential(new stopCom());
			  addSequential(new rightTurn(2));
			  addSequential(new stopCom());
			  addSequential(new forwardtime(1));
			  addSequential(new stopCom());
			  addSequential(new stopCom());
			  addSequential(new dumpOutCom());
			  addSequential(new dumpInCom());
		  }
	   }
}

    


