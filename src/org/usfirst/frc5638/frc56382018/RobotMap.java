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

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_VictorSPX driveTrainVictorSPXleft;
    public static WPI_TalonSRX driveTrainTalonSRXleft;
    public static SpeedControllerGroup driveTrainleftGearbox;
    public static WPI_VictorSPX driveTrainVictorSPXright;
    public static WPI_TalonSRX driveTrainTalonSRXright;
    public static SpeedControllerGroup driveTrainrightGearbox;
    public static DifferentialDrive driveTrainRobotDrive21;
    public static WPI_TalonSRX elevatorTalonSRXelevator;
    public static WPI_VictorSPX intakeTalonSRXintake2;
    public static WPI_VictorSPX intakeTalonSRXintake1;
    public static WPI_TalonSRX dumpTalonSRXdump;
    public static WPI_TalonSRX climberMotorsTalonSRXclimber1;
    public static WPI_TalonSRX climberMotorsTalonSRXclimber2;
    public static SpeedControllerGroup climberMotorsSpeedControllerGroup1;
    public static WPI_TalonSRX armTalonSRXarm;
    public static DoubleSolenoid intakeOCDoubleSolenoidintake;
    public static DoubleSolenoid shiftDoubleSolenoidshift;
    public static Spark LEDcontroller;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        driveTrainTalonSRXleft = new WPI_TalonSRX(2);
        driveTrainTalonSRXleft.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
        driveTrainTalonSRXleft.setSensorPhase(true);
        driveTrainTalonSRXleft.setSafetyEnabled(false);
        driveTrainTalonSRXleft.config_kP(0, .17, 10);//(0, .03, 10); //.055
        driveTrainTalonSRXleft.config_kI(0, 0, 10);//(0, 0.000005, 10);
        driveTrainTalonSRXleft.config_kD(0, 40, 10);//(0, 200, 10);
        driveTrainTalonSRXleft.config_kP(1, .1, 10); //.055
        driveTrainTalonSRXleft.config_kI(1, 0, 10);
        driveTrainTalonSRXleft.config_kD(1, 0, 10);
        driveTrainTalonSRXleft.configAllowableClosedloopError(0, 50, 10);
        driveTrainTalonSRXleft.configNominalOutputForward(0, 10);
        driveTrainTalonSRXleft.configNominalOutputReverse(0, 10);
        driveTrainTalonSRXleft.configPeakOutputForward(1, 10);
        driveTrainTalonSRXleft.configPeakOutputReverse(-1, 10);
        driveTrainTalonSRXleft.configClosedloopRamp(0.5, 10);
        driveTrainTalonSRXleft.configOpenloopRamp(0, 10);
        
        driveTrainVictorSPXleft = new WPI_VictorSPX(3);
        driveTrainVictorSPXleft.follow(driveTrainTalonSRXleft);
        
        driveTrainleftGearbox = new SpeedControllerGroup(driveTrainTalonSRXleft, driveTrainVictorSPXleft  );
        //LiveWindow.addActuator("driveTrain", "leftGearbox", driveTrainleftGearbox);
        
        
        
        
        driveTrainTalonSRXright = new WPI_TalonSRX(4);
        driveTrainTalonSRXright.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
        driveTrainTalonSRXright.setSensorPhase(true);
        driveTrainTalonSRXright.setSafetyEnabled(false);
        driveTrainTalonSRXright.config_kP(0, .17, 10);//(0, .03, 10); //.05
        driveTrainTalonSRXright.config_kI(0, 0, 10);//(0, 0.000005, 10);
        driveTrainTalonSRXright.config_kD(0, 25, 10);//(0, 200, 10);
        driveTrainTalonSRXright.config_kP(1, .1, 10); //.05
        driveTrainTalonSRXright.config_kI(1, 0, 10);
        driveTrainTalonSRXright.config_kD(1, 0.75, 10);
        driveTrainTalonSRXright.configAllowableClosedloopError(0, 50, 10);
        driveTrainTalonSRXright.configNominalOutputForward(0, 10);
        driveTrainTalonSRXright.configNominalOutputReverse(0, 10);
        driveTrainTalonSRXright.configPeakOutputForward(1, 10);
        driveTrainTalonSRXright.configPeakOutputReverse(-1, 10);
        driveTrainTalonSRXright.configClosedloopRamp(0.5, 10);
        driveTrainTalonSRXright.configOpenloopRamp(0, 10);
        
        driveTrainVictorSPXright = new WPI_VictorSPX(5);
        driveTrainVictorSPXright.follow(driveTrainTalonSRXright);
        //driveTrainVictorSPXright.set(ControlMode.Follower, 4);
        
        
        driveTrainrightGearbox = new SpeedControllerGroup(driveTrainTalonSRXright, driveTrainVictorSPXright);
        //LiveWindow.addActuator("driveTrain", "rightGearbox", driveTrainrightGearbox);
        
        driveTrainRobotDrive21 = new DifferentialDrive(driveTrainleftGearbox, driveTrainrightGearbox);
        
        driveTrainRobotDrive21.setSafetyEnabled(false);
        driveTrainRobotDrive21.setExpiration(0.1);
        //driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        elevatorTalonSRXelevator = new WPI_TalonSRX(6);
        elevatorTalonSRXelevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
        elevatorTalonSRXelevator.configNominalOutputForward(0, 10);
        elevatorTalonSRXelevator.configNominalOutputReverse(0, 10);
        elevatorTalonSRXelevator.configPeakOutputForward(.75, 10);
        elevatorTalonSRXelevator.configPeakOutputReverse(-.375, 10);
        elevatorTalonSRXelevator.config_kP(0, .5, 10);
        elevatorTalonSRXelevator.config_kI(0, 0, 10);
        elevatorTalonSRXelevator.config_kD(0, 10, 10);
        
        intakeTalonSRXintake2 = new WPI_VictorSPX(10);
        
        
        intakeTalonSRXintake1 = new WPI_VictorSPX(9);
        
        
        dumpTalonSRXdump = new WPI_TalonSRX(7);
        dumpTalonSRXdump.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
        dumpTalonSRXdump.configNominalOutputForward(0, 10);
        dumpTalonSRXdump.configNominalOutputReverse(0, 10);
        dumpTalonSRXdump.configPeakOutputForward(1, 10);
        dumpTalonSRXdump.configPeakOutputReverse(-1, 10);
        dumpTalonSRXdump.config_kP(0, .25, 10);
        dumpTalonSRXdump.config_kI(0, 0, 10);
        dumpTalonSRXdump.config_kD(0, 0, 10);
        
        
        climberMotorsTalonSRXclimber1 = new WPI_TalonSRX(12);
        
        climberMotorsTalonSRXclimber1.setInverted(false);
        
        
        climberMotorsTalonSRXclimber2 = new WPI_TalonSRX(11);
        
        climberMotorsTalonSRXclimber2.setInverted(true);
        
        
        climberMotorsSpeedControllerGroup1 = new SpeedControllerGroup(climberMotorsTalonSRXclimber1, climberMotorsTalonSRXclimber2);
        //LiveWindow.addActuator("climberMotors", "Speed Controller Group 1", climberMotorsSpeedControllerGroup1);
        
        armTalonSRXarm = new WPI_TalonSRX(8);
        
        
        intakeOCDoubleSolenoidintake = new DoubleSolenoid(0, 2, 3);
        //LiveWindow.addActuator("intakeOC", "Double Solenoid intake", intakeOCDoubleSolenoidintake);
        
        shiftDoubleSolenoidshift = new DoubleSolenoid(0, 0, 1);
        //LiveWindow.addActuator("shift", "Double Solenoid shift", shiftDoubleSolenoidshift);
        
        LEDcontroller = new Spark(0);
        LEDcontroller.setSafetyEnabled(false);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
