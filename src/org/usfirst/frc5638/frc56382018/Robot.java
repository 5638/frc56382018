// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5638.frc56382018;

import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5638.frc56382018.commands.*;
import org.usfirst.frc5638.frc56382018.subsystems.*;

import com.kauailabs.navx.frc.AHRS;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command RightAuto;
    Command RightAutoDump;
    Command CenterAuto;
    Command CenterAutoRight;
    Command LeftAuto;
    Command LeftAutoDump;
    Command drivePos1;
    Command driveForward;
    Command autonomousCommand;
    SendableChooser<Command> autonomousModes;

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static driveTrain driveTrain;
    public static elevator elevator;
    public static intake intake;
    public static dump dump;
    public static climberMotors climberMotors;
    public static arm arm;
    public static intakeOC intakeOC;
    public static shift shift;
    public static AHRS ahrs;
    public static LEDsub LEDsub;
    public static variables variables;
    
    public static boolean left = false;
    public static boolean right = false;
    
    public static String gamedata = "UUU";
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new driveTrain();
        elevator = new elevator();
        intake = new intake();
        dump = new dump();
        climberMotors = new climberMotors();
        arm = new arm();
        intakeOC = new intakeOC();
        shift = new shift();
        ahrs = new AHRS(SPI.Port.kMXP);
        LEDsub = new LEDsub();
        variables = new variables();
        
        
        
        //CameraServer.getInstance().startAutomaticCapture();
        
        
        
        
        RightAuto = new RightAuto();
        
        driveForward = new driveForward(3);

        //LEDcom = new LEDcom();
        //LEDcom.start();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // Add commands to Autonomous Sendable Chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
     


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousModes = new SendableChooser<Command>();
        SmartDashboard.putData("Auto mode", autonomousModes);
        autonomousModes.addObject("Right Auto", new RightAuto());
        autonomousModes.addObject("Center Auto", new CenterAuto());
        autonomousModes.addObject("Left Auto", new LeftAuto());
        autonomousModes.addObject("Drive Straight", new driveForward(3));
        autonomousModes.addObject("Do Nothing", new stopCom());
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){
    	//LEDcom.start();
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
    	/*
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
        if(gameData.length() > 0) {
			  if(gameData.charAt(0) == 'R') {
				  variables.right = true;
				  variables.left = false;
			  }else{
				  variables.left = true;
				  variables.right = false;
			  }
        }
        if(variables.right == true || variables.left == true) {
        */
        	RightAuto = (Command) autonomousModes.getSelected();
        	if (RightAuto != null) RightAuto.start();
        //}
    	RobotMap.dumpTalonSRXdump.setSelectedSensorPosition(0, 0, 10); //Set dump position to 0
    	RobotMap.elevatorTalonSRXelevator.setSelectedSensorPosition(0, 0, 10); //Set elevator position to 0
    	
    	double timer = Timer.getFPGATimestamp(); //Get system time
		gamedata = DriverStation.getInstance().getGameSpecificMessage(); //1st try to get GameData
		
		//If GameData was not retrieved above, this loop should start. It will go until GameData is no longer "UUU" and there is still 3 characters. Loops every 20ms. If data is not retrieved within 10 seconds, it defaults to drive forward.
		while(gamedata == "UUU" 
				&& gamedata.length() != 3 
				&& gamedata.charAt(0) == 'U' 
				&& gamedata.charAt(1) == 'U'
				&& gamedata.charAt(2) == 'U'
				|| Timer.getFPGATimestamp() - timer > 10) 
		{	
			try {
				Thread.sleep(5); //Makes the thread wait 5ms before trying again to avoid overload.
				gamedata = DriverStation.getInstance().getGameSpecificMessage();
				System.out.println(gamedata  + ": This should be UUU which means No Data Aquired. If anything other than that, code is buggy.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//This tells us that we've gotten the GameData, what it is, and how long it took to get it.
		if(gamedata != "UUU") {
			System.out.println("GameData Retrieved in " + (Timer.getFPGATimestamp() - timer) + " seconds!");
			System.out.println("Gamedata is: " + gamedata);
		}
        
        SmartDashboard.putString("Game Data", gamedata);
        
    	autonomousCommand = (Command) autonomousModes.getSelected();
    	//Checks to see if an auto is chosen and if GameGata is usable. If any of these are not true, it defaults to drive forward.
        if (autonomousCommand != null 
        		&& gamedata.charAt(0) != 'U' 
				&& gamedata.charAt(1) != 'U'
				&& gamedata.charAt(2) != 'U') 
        {	
        	autonomousCommand.start();
        }else if(gamedata.charAt(0) == 'U' && Timer.getFPGATimestamp() - timer > 11){
        	driveForward.start();
        }
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //LEDcom.start();
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("dump position", RobotMap.dumpTalonSRXdump.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("left drive", RobotMap.driveTrainTalonSRXleft.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("right drive", RobotMap.driveTrainTalonSRXright.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("elevator", RobotMap.elevatorTalonSRXelevator.getSelectedSensorPosition(0));
        
        
        
    }
    
    public Robot() {
    	CameraServer.getInstance().startAutomaticCapture();
    }
}
