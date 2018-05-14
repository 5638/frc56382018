package org.usfirst.frc5638.frc56382018.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightAutoDump extends CommandGroup {

    public RightAutoDump() {
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
    	addSequential(new resetDumpPos());
		  addSequential(new resetElevatorCom());
		  
		  addSequential(new forwardtime(3));
		  addSequential(new stopCom());
		  addSequential(new leftTurn(1.35));
		  addSequential(new forwardtime(.25));
		  addSequential(new stopCom());
		  addSequential(new dumpOutCom());
		  addSequential(new dumpInCom());
    }
}
