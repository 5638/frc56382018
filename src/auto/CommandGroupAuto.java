package auto;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc5638.frc56382018.commands.*;
import auto.WhatDo;
import auto.Position;


/** the sequence of commands for autonomous */
public class CommandGroupAuto extends CommandGroup {

	//Stores the states of the switches and scale
	String gameData;

	public CommandGroupAuto(Position position, WhatDo whatDo) {
		//Get the state of the switches and scale for each round
		gameData = DriverStation.getInstance().getGameSpecificMessage();

		// make sure everything is in the right state/position up here


		// EX: making sure flap is closed before auto starts
		switch (position) {
		
		
		
			case LEFT:
				switch (whatDo){
					case RUN_FOR_IT:
						addSequential(new resetDumpPos());
						addSequential(new resetElevatorCom());
						addSequential(new driveForward(3));
						break;
					
					
					
					case SWITCH:
						if (gameData.charAt(0) == 'L'){ //When the switch is on the left
							addSequential(new resetDumpPos());
							addSequential(new resetElevatorCom());
							addSequential(new forwardtime(2.75));
							addSequential(new stopCom());
							addSequential(new rightTurn(2.25));
							addSequential(new forwardtime(.5));
							addSequential(new stopCom());
							addSequential(new stopCom());
							addSequential(new dumpInCom());
							addSequential(new dumpOutCom());
						} else { //When the switch is on the right
							addSequential(new resetDumpPos());
							addSequential(new resetElevatorCom());
							addSequential(new driveForward(3));
						}
						break;
						
					case NOTHING:
						break;
						
			case BEST_OPTION:
					break;
			}
					break;

					
					
					
			case CENTER:
				switch (whatDo){
					case RUN_FOR_IT:
						addSequential(new resetDumpPos());
						addSequential(new resetElevatorCom());
						addSequential(new driveForward(3));
						break;
					case SWITCH:
						if (gameData.charAt(0) == 'L'){ //When the switch is on the left
							addSequential(new resetDumpPos());
							addSequential(new resetElevatorCom());  
							addSequential(new forwardtime(.5));
							addSequential(new stopCom());
							addSequential(new leftTurn(1.3));
							addSequential(new stopCom());
							addSequential(new forwardtime(1.25));
							addSequential(new stopCom());
							addSequential(new rightTurn(1.8));
							addSequential(new stopCom());
							addSequential(new forwardtime(2));
							addSequential(new stopCom());
							addSequential(new stopCom());
							addSequential(new dumpOutCom());
							addSequential(new dumpInCom());

						} else { //When the switch is on the right
							addSequential(new resetDumpPos());
							addSequential(new resetElevatorCom());
							addSequential(new forwardtime(.5));
							addSequential(new stopCom());
							addSequential(new rightTurn(1.75));
							addSequential(new stopCom());
							addSequential(new forwardtime(1));
							addSequential(new stopCom());
							addSequential(new leftTurn(1.75));
							addSequential(new stopCom());
							addSequential(new forwardtime(2));
							addSequential(new stopCom());
							addSequential(new stopCom());
							addSequential(new dumpOutCom());
							addSequential(new dumpInCom());
						}
						break;
						
					case NOTHING:
						break;
						
					case BEST_OPTION:
						break;
			}
				break;
				
			case RIGHT:
				switch (whatDo) {
					case RUN_FOR_IT:
						addSequential(new resetDumpPos());
						addSequential(new resetElevatorCom());
						addSequential(new driveForward(3));
						break;
						
						
						
					case SWITCH:
						if (gameData.charAt(0) == 'R'){ //When the switch is on the right
							addSequential(new resetDumpPos());
							addSequential(new resetElevatorCom());
							addSequential(new forwardtime(2.5));
							addSequential(new stopCom());
							addSequential(new leftTurn(1));
							addSequential(new stopCom());
							addSequential(new stopCom());
							addSequential(new forwardtime(.5));
							addSequential(new stopCom());
							addSequential(new stopCom());
							addSequential(new dumpInCom());
							addSequential(new dumpOutCom());
						} else { //When the switch is on the left
							addSequential(new resetDumpPos());
							addSequential(new resetElevatorCom());
							addSequential(new driveForward(3));
						}
						break;
						
					case NOTHING:
						break;
						
					case BEST_OPTION:
						break;
				}
			break;
		}	
	}
}