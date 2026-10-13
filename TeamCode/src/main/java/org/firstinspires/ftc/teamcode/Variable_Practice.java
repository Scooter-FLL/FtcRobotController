package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Variable_Practice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Cyber Eagles";
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Name", teamName);
        telemetry.addData("Motor Angle", motorAngle);

        /*
        1. change the string variable "name" to teamName
         2. create an int called "motorAngle" and store an angle between 0-180. Display in int method.
         */
    }

    @Override
    public void loop() {

    }
}
