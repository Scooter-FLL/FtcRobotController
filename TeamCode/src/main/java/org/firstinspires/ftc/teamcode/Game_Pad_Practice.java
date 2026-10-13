package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Game_Pad_Practice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //runs 50xs a second
        double speedForward = gamepad1.left_stick_y / 2.0;
        double diffXjoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriiggers = gamepad1.left_trigger + gamepad1.right_trigger;


        telemetry.addData("left x", gamepad1.left_stick_x);
        telemetry.addData("left y", speedForward);
        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData("difference x", diffXjoysticks);


        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);

        telemetry.addData("sum triggers", sumTriiggers);

    }

        /*
        1. add telemetry for the right joystick
        2. add telemetry for the "b" button
        3. add telemetry data to report the DIFFERENCE between x lft joystick and x on rgt joystick
        4. add telemetry data to report the sum of both rear triggers.
         */

    }
}
