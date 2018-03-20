/*package org.usfirst.frc5638.frc56382018.commands;

import org.usfirst.frc5638.frc56382018.subsystems.variables;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 *//*
public class LeftAuto extends CommandGroup {

    public LeftAuto() {
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
         
         *//*
    	addSequential(new stopCom());
    	/*
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		/*
        if(gameData.length() > 0) {
		  if(gameData.charAt(0) == 'L') {
			  SmartDashboard.putString("FMS Data", gameData);
			  SmartDashboard.putString("AutoRoutine", "Dumping");
			  addSequential(new forwardtime(3));
=======
		  if(variables.left = true) {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
			  addSequential(new forwardtime(2.75));
>>>>>>> 9684d6dcccbfd2744d98a3160de7f6d0ff1378e9
			  addSequential(new stopCom());
			  addSequential(new rightTurn(2.25));
			  addSequential(new forwardtime(.25));
			  addSequential(new stopCom());
			  addSequential(new dumpOutCom());
			  addSequential(new dumpInCom());
<<<<<<< HEAD
			  /*
		  } else /*if(gameData.charAt(0) == 'R')*/// {
			 //SmartDashboard.putString("FMS Data", gameData);
			  //SmartDashboard.putString("AutoRoutine", "Not Dumping");
			  //addSequential(new forwardtime(.5)); //3
			  
			  //addSequential(new stopCom());
			  //addSequential(new rightTurn(2));
			  //addSequential(new stopCom());
			  //addSequential(new forwardtime(3));
			  //addSequential(new stopCom());
			  //addSequential(new leftTurn(1.75));
			  //addSequential(new stopCom());
			  //addSequential(new forwardtime(1));
=======
		  } else {
			  addSequential(new resetDumpPos());
			  addSequential(new resetElevatorCom());
			  
			  addSequential(new forwardtime(.5)); //3
			  //addSequential(new stopCom());
			  //addSequential(new rightTurn(2));
			  //addSequential(new stopCom());
			  addSequential(new forwardtime(3));
			  //addSequential(new stopCom());
			  //addSequential(new leftTurn(1.75));
			  //addSequential(new stopCom());
			  addSequential(new forwardtime(1));
>>>>>>> 9684d6dcccbfd2744d98a3160de7f6d0ff1378e9
			  //addSequential(new stopCom());
			  //addSequential(new stopCom());
			  //addSequential(new dumpOutCom());
			  //addSequential(new dumpInCom());
<<<<<<< HEAD
			  
			  //addSequential(new stopCom());
		  //}
       //}
    //}*/
//}
=======
			  addSequential(new stopCom());
		  }
       }
    }
>>>>>>> 9684d6dcccbfd2744d98a3160de7f6d0ff1378e9
