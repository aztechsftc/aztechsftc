package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by neeraja on 12/1/2016.
 */
public class AutoBlue1 extends LinearOpMode {

    final static double MOTOR_POWER = 0.5; // Higher values will cause the robot to move faster

    DcMotor motorRight;
    DcMotor motorLeft;
    DcMotor motorElevator;
    DcMotor motorBrush;
    DcMotor motorLaunchL;
    DcMotor motorLaunchR;


    @Override
    public void runOpMode() throws InterruptedException {
        //start position near the diagonal line

        // set up the hardware devices we are going to use
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        //
        motorLaunchL = hardwareMap.dcMotor.get("motorLauncherL");
        motorLaunchL.setDirection(DcMotor.Direction.REVERSE);
        motorLaunchR = hardwareMap.dcMotor.get("motorLauncherR");
        //
        motorElevator = hardwareMap.dcMotor.get("motorElevator");
        //
        motorBrush = hardwareMap.dcMotor.get("motorBrush");

        // wait for the start button to be pressed
        waitForStart();

        //segment 1 -- go forward along the diagonal
        driveForward(0.25, 1550);

        stopDriving();

        operateShooter();

        driveForward(0.5, 1000);

        turnRight45();

        //segment 4 -- go hit the beacon
        driveForward(0.125, 5000);

        //segment 5 -- reverse
        driveReverse(0.125, 5000);

        stopDriving();
    }

    public void driveForward(double power, long durationinMilliSeconds) throws InterruptedException {
        motorLeft.setPower(Range.clip(power, -1.0, 1.0));
        motorRight.setPower(Range.clip(power, -1.0, 1.0));
        sleep(durationinMilliSeconds); //may need to changed, time in milliseconds
    }

    public void driveReverse(double power, long durationinMilliSeconds) throws InterruptedException {
        motorLeft.setPower(Range.clip(-power, -1.0, 1.0));
        motorRight.setPower(Range.clip(-power, -1.0, 1.0));
        sleep(durationinMilliSeconds); //may need to changed, time in milliseconds
    }

    public void turnRight() throws InterruptedException {
        double powerFactor = 0.25;
        motorLeft.setPower(powerFactor);
        motorRight.setPower(-powerFactor);
        sleep(950); //may need to changed, time in milliseconds
    }

    public void turnRight45() throws InterruptedException {
        double powerFactor = 0.25;
        motorLeft.setPower(powerFactor);
        motorRight.setPower(-powerFactor);
        sleep(300); //may need to changed, time in milliseconds
    }

    public void turnLeft() throws InterruptedException {
        double powerFactor = 0.25;
        motorLeft.setPower(-powerFactor);
        motorRight.setPower(+powerFactor);
        sleep(650); //may need to changed, time in milliseconds
    }

    public void uTurnFromRight() throws InterruptedException {
        double powerFactor = 0.25;
        motorLeft.setPower(powerFactor);
        motorRight.setPower(-powerFactor);
        sleep(900); //may need to changed, time in milliseconds
    }

    public void uTurnFromLeft() throws InterruptedException {
        double powerFactor = 0.25;
        motorLeft.setPower(-powerFactor);
        motorRight.setPower(+powerFactor);
        sleep(1300); //may need to changed, time in milliseconds
    }

    /**
     * Set the power to left and right motors, the values must range
     * between -1 and 1.
     *
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

    public void pause(long durationinMilliSeconds) throws InterruptedException {
        setDrivePower(0.0, 0.0);
        sleep(durationinMilliSeconds);
    }

    public void stopDriving() {
        setDrivePower(0.0, 0.0);
    }

    public void operateShooter() throws InterruptedException {
        //spin the flywheels
        motorLaunchL.setPower(1);
        motorLaunchR.setPower(1);
        sleep(4000); //may need to changed, time in milliseconds

        //First shot
        motorElevator.setPower(1);
        sleep(500);

        //Reverse elevator
        motorElevator.setPower(-1);
        sleep(550);

        //Second Shot
        motorElevator.setPower(1);
        sleep(3000);

        //turn off shooter
        motorLaunchL.setPower(0);
        motorLaunchR.setPower(0);
        motorElevator.setPower(0);
    }
}
