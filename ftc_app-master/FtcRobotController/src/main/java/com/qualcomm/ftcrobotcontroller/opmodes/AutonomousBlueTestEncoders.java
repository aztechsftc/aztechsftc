package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by neeraja on 12/1/2016.
 */
public class AutonomousBlueTestEncoders extends LinearOpMode {

    final static double MOTOR_POWER = 0.5; // Higher values will cause the robot to move faster

    DcMotor motorRight;
    DcMotor motorLeft;
    DcMotor motorElevator;
    DcMotor motorBrush;
    DcMotor motorLaunchL;
    DcMotor motorLaunchR;


    @Override
    public void runOpMode() throws InterruptedException {

        double powerFactor = MOTOR_POWER;

        double nominalCoefficientRightMotor = 0.3; // go straight
//        double nominalCoefficientRightMotor = 0.55; // go straight
//        double nominalCoefficientRightMotor = 1;   //CURVES to the left
        double nominalCoefficientLeftMotor = 1;

        double motorPowerLeftNominal = nominalCoefficientLeftMotor * powerFactor;
        double motorPowerRightNominal = nominalCoefficientRightMotor * powerFactor;

        // set up the hardware devices we are going to use
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        //motorLeft.setDirection(DcMotor.Direction.REVERSE);
        //motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorElevator = hardwareMap.dcMotor.get("motorElevator");
        motorBrush = hardwareMap.dcMotor.get("motorBrush");
        motorLaunchL = hardwareMap.dcMotor.get("motorLauncherL");
        motorLaunchR = hardwareMap.dcMotor.get("motorLauncherR");


        motorRight.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        motorLeft.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);


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




        //execute the turn in 750sec
        long startTime = System.currentTimeMillis();
        long turningTime = 500;
        double turnMagnitude = 0.4;  //0 means no turns 1 is max


        motorLeft.setPower(1);
        motorRight.setPower(.3);
        sleep(500); //may need to changed, time in milliseconds


        motorLeft.setPower(0);
        motorRight.setPower(0);
        sleep(3000); //may need to changed, time in milliseconds

//turn
        motorRight.setPower(-.75);
        motorLeft.setPower(1.00);
        sleep(200); //may need to changed, time in milliseconds

        motorLeft.setPower(1);
        motorRight.setPower(.55);
        sleep(750); //may need to changed, time in milliseconds


        motorLeft.setPower(0);
        motorRight.setPower(0);
        sleep(5000); //may need to changed, time in milliseconds
        //divide this turn into four segments


        //start of shooting
        //        //
//        motorLaunchL.setPower(1);
//        motorLaunchR.setPower(1);
//        sleep(3000); //may need to changed, time in milliseconds
//
//        motorElevator.setPower(1);
//        sleep(6000);

        motorLeft.setPower(1);
        motorRight.setPower(.6);
        sleep(1250); //may need to changed, time in milliseconds
        //segment 1 == start of turn
//        long currentTime = System.currentTimeMillis();
//        double elapsedTimeFraction = (currentTime - startTime) / turningTime;
//        motorLeft.setPower(motorPowerLeftNominal * (1 + turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        motorRight.setPower(motorPowerRightNominal * (1 - turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        sleep(turningTime / 4); //may need to changed, time in milliseconds

        //motorPowerLeftNominal*(1+turnMagnitude*elapsedTimeFraction*(1-elapsedTimeFraction))
        //motorPowerRightNominal*(1-turnMagnitude*elapsedTimeFraction*(1-elapsedTimeFraction))

        //segment 2 == into the turn
//        currentTime = System.currentTimeMillis();
//        elapsedTimeFraction = (currentTime - startTime) / turningTime;
//        motorLeft.setPower(motorPowerLeftNominal * (1 + turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        motorRight.setPower(motorPowerRightNominal * (1 - turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        sleep(turningTime / 4); //may need to changed, time in milliseconds

        //segment 3 == max turn
//        currentTime = System.currentTimeMillis();
//        elapsedTimeFraction = (currentTime - startTime) / turningTime;
//        motorLeft.setPower(motorPowerLeftNominal * (1 + turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        motorRight.setPower(motorPowerRightNominal * (1 - turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        sleep(turningTime / 4); //may need to changed, time in milliseconds

        //segment 4 == start straighten
//        currentTime = System.currentTimeMillis();
//        elapsedTimeFraction = (currentTime - startTime) / turningTime;
//        motorLeft.setPower(motorPowerLeftNominal * (1 + turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        motorRight.setPower(motorPowerRightNominal * (1 - turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        sleep(turningTime / 4); //may need to changed, time in milliseconds

        //segment 5 == straighten
//        currentTime = System.currentTimeMillis();
//        elapsedTimeFraction = (currentTime - startTime) / turningTime;
//        motorLeft.setPower(motorPowerLeftNominal * (1 + turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        motorRight.setPower(motorPowerRightNominal * (1 - turnMagnitude * elapsedTimeFraction * (1 - elapsedTimeFraction)));
//        sleep(turningTime / 4); //may need to changed, time in milliseconds

        //Turn completed.  Now go in a straight line
//        motorLeft.setPower(motorPowerLeftNominal);
//        motorRight.setPower(motorPowerRightNominal);
//        sleep(2000); //may need to changed, time in milliseconds


        //stop the motors
        motorRight.setPower(0);
        motorLeft.setPower(0);
        sleep(5000);

        //motorLaunchL.setPower(1);
        //motorLaunchR.setPower(1);
        //motorElevator.setPower(1);
        //sleep(6000);

        //motorLeft.setPower(MOTOR_POWER);
        //motorRight.setPower(MOTOR_POWER * 0.5);
        //sleep(1000); //may need to changed, time in milliseconds

        //motorRight.setPower(0);
        //motorLeft.setPower(0);


        //sleep(500);

        //motorLeft.setPower(MOTOR_POWER);
        //motorRight.setPower(MOTOR_POWER * 0.5);
        //sleep(500); //may need to changed, time in milliseconds
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
        //motorRight.setPower(0);
        //motorLeft.setPower(0);
    }

    /**
     * Set the power to left and right motors, the values must range
     * between -1 and 1.
     * @param left
     * @param right
     */
    public void setDrivePower(double left, double right) {
        // This assumes power is given as -1 to 1
        // The range clip will make sure it is between -1 and 1
        // An incorrect value can cause the program to exception
        motorLeft.setPower(Range.clip(left, -1.0, 1.0));
        motorRight.setPower(Range.clip(right, -1.0, 1.0));
    }

    public void setDriveMode(DcMotorController.RunMode mode) {


        motorRight.setMode(mode);

        if (motorLeft.getMode() != mode) {
            motorLeft.setMode(mode);
        }

        if (motorRight.getMode() != mode) {
            motorRight.setMode(mode);
        }

    }

}
