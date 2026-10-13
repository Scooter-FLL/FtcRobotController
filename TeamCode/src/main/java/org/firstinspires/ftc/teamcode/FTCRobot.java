package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@Autonomous (left on DS) or @TeleOp (right on DS)
@Autonomous
public class FTCRobot extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "World");

    }

    @Override
    public void loop() {

        //Single Line Comment
        /*
        1. Hello: World. change the telemetary data to display "Hello: Your name"
        2. Run this code in the Autonomous section of your DS
         */
    }
}
