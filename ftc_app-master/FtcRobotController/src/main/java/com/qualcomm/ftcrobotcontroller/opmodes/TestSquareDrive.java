package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by neeraja on 7/31/2016.
 */
public class TestSquareDrive extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    Servo leftGripper;
    Servo rightGripper;

    @Override
    public void runOpMode() throws InterruptedException {
        rightMotor = hardwareMap.dcMotor.get("motor_right");  //motor_2
        leftMotor = hardwareMap.dcMotor.get("motor_left");  //motor_1
        leftGripper = hardwareMap.servo.get("servo_left");
        rightGripper = hardwareMap.servo.get("servo_right");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        for(int i = 0; i < 15; i++)
        {
            leftMotor.setPower(1.0);
            rightMotor.setPower(1.0);
            sleep(1000);

            leftMotor.setPower(0.20);
            rightMotor.setPower(-0.20);
            sleep(650);

            /*leftGripper.setPosition();
            rightGripper.setPosition();

            leftGripper.setPosition();
            rightGripper.setPosition();*/
        }
    }
}
