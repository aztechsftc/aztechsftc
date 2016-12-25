package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by neeraja on 8/12/2016.
 */
public class TestCircleDrive extends OpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {
        rightMotor = hardwareMap.dcMotor.get("motor_right");  //motor_2
        leftMotor = hardwareMap.dcMotor.get("motor_left");  //motor_1

        rightMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftMotor.setPower(0.99);
        rightMotor.setPower(0.1111);

    }
}
