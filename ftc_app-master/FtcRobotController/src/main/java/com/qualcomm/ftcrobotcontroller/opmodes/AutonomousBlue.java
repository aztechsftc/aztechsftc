package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
/**
 * Created by neeraja on 12/1/2016.
 */
public class AutonomousBlue extends LinearOpMode {

    final static double MOTOR_POWER = 0.5; // Higher values will cause the robot to move faster

    DcMotor motorRight;
    DcMotor motorLeft;
    DcMotor motorElevator;
    DcMotor motorBrush;
    DcMotor motorLaunchL;
    DcMotor motorLaunchR;



    @Override
    public void runOpMode() throws InterruptedException {

        // set up the hardware devices we are going to use

        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        //motorLeft.setDirection(DcMotor.Direction.REVERSE);
        //motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorElevator = hardwareMap.dcMotor.get("motorElevator");
        motorBrush = hardwareMap.dcMotor.get("motorBrush");
        motorLaunchL = hardwareMap.dcMotor.get("motorLauncherL");
        motorLaunchR = hardwareMap.dcMotor.get("motorLauncherR");



        // wait for the start button to be pressed
        waitForStart();

        //TURN IN PLACE
        //motorLeft.setPower(MOTOR_POWER);
        //motorRight.setPower(-MOTOR_POWER);
        //sleep(500);

        //GO FORWARD WHILE TURNING
        //motorLeft.setPower(MOTOR_POWER);
        //motorRight.setPower(-0.5 * MOTOR_POWER);
        //sleep(500);


        //comment

        //goes forward and hits ball
        //motorLeft.setPower(-MOTOR_POWER);
        motorLeft.setPower(MOTOR_POWER);
        motorRight.setPower(MOTOR_POWER*0.5);
        sleep(750); //may need to changed, time in milliseconds

        motorRight.setPower(0);
        motorLeft.setPower(0);
        sleep(5000);

        //motorLaunchL.setPower(1);
        //motorLaunchR.setPower(1);
        //motorElevator.setPower(1);
        //sleep(6000);

        motorLeft.setPower(MOTOR_POWER);
        motorRight.setPower(MOTOR_POWER*0.5);
        sleep(1000); //may need to changed, time in milliseconds

        motorRight.setPower(0);
        motorLeft.setPower(0);
        sleep(500);

        motorLeft.setPower(MOTOR_POWER);
        motorRight.setPower(MOTOR_POWER*0.5);
        sleep(500); //may need to changed, time in milliseconds
//
//        motorRight.setPowerFloat();  // if something doesn't work here, delete these 3 lines
//        motorLeft.setPowerFloat();
//        sleep(1000);
//
//        //gets on ramp
//        motorLeft.setPower(MOTOR_POWER);
//        motorRight.setPower(MOTOR_POWER);
//        sleep(500);  //may need to be changed

        // stop the motors
        motorRight.setPower(0);
        motorLeft.setPower(0);
    }
}
