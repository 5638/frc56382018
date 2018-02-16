package org.usfirst.frc5638.frc56382018.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class autotest extends CommandGroup {

    public autotest() {
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
    	addSequential(new resetDrivePos());
    	addSequential(new drivePos1());
    	addSequential(new resetDrivePos());
    	addSequential(new rightTurn());
    	addSequential(new resetDrivePos());
    	addSequential(new driveForward());
    	addSequential(new resetDrivePos());
    	addSequential(new leftTurn());
    	addSequential(new resetDrivePos());
    	addSequential(new drivePos1());
    	//addSequential(new dumpInCom());
    	//addSequential(new dumpOutCom());
    }
}
