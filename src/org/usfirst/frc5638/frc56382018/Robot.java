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
    Command CenterAuto;
    Command drivePos1;
    Command LEDcom;
    SendableChooser<Object> autonomousModes;

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
        
        //CameraServer.getInstance().startAutomaticCapture();
        
        
        autonomousModes = new SendableChooser<Object>();
        
        RightAuto = new RightAuto();

        LEDcom = new LEDcom();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // Add commands to Autonomous Sendable Chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
     


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        SmartDashboard.putData("Auto mode", autonomousModes);
        
        autonomousModes.addObject("Right Auto", new RightAuto());
        autonomousModes.addObject("Center Auto", new CenterAuto());
        autonomousModes.addObject("Left Auto", new LeftAuto());
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){
    	
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
    	RightAuto = (Command) autonomousModes.getSelected();
        if (RightAuto != null) RightAuto.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("dump position", RobotMap.dumpTalonSRXdump.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("left drive", RobotMap.driveTrainTalonSRXleft.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("right drive", RobotMap.driveTrainTalonSRXright.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("elevator", RobotMap.elevatorTalonSRXelevator.getSelectedSensorPosition(0));
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (drivePos1 != null) drivePos1.cancel();
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
    	CameraServer.getInstance().startAutomaticCapture();
    	LEDcom.start();
    }
}