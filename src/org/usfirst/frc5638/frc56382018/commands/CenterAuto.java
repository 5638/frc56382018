/*package org.usfirst.frc5638.frc56382018.commands;

import org.usfirst.frc5638.frc56382018.subsystems.variables;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 *//*
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
    	
<<<<<<< HEAD
    	
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		
       // if(gameData.length() > 0) {
		  if(gameData.charAt(0) == 'R') {
			  //SmartDashboard.putString("FMS Data", gameData);
			  //SmartDashboard.putString("AutoRoutine", "Dumping Right");
=======
		  if(variables.right = true) {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
>>>>>>> 9684d6dcccbfd2744d98a3160de7f6d0ff1378e9
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
<<<<<<< HEAD
			  
		  } else {
			  //SmartDashboard.putString("FMS Data", gameData);
			  //SmartDashboard.putString("AutoRoutine", "Dumping Left");
=======
		  } else if(variables.left = true) {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
>>>>>>> 9684d6dcccbfd2744d98a3160de7f6d0ff1378e9
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
<<<<<<< HEAD
   // }*/
=======
>>>>>>> 9684d6dcccbfd2744d98a3160de7f6d0ff1378e9

