package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class MotorTest extends LinearOpMode {
    DcMotorEx FL, FR, BL, BR;

    @Override
    public void runOpMode() throws InterruptedException {

        FL = hardwareMap.get(DcMotorEx.class, "FL");
        FR = hardwareMap.get(DcMotorEx.class, "FR");
        BL = hardwareMap.get(DcMotorEx.class, "BL");
        BR = hardwareMap.get(DcMotorEx.class, "BR");

        waitForStart();
        while (opModeIsActive()) {

            if (gamepad1.dpad_up) {
                FL.setPower(1);
                FR.setPower(0);
                BL.setPower(0);
                BR.setPower(0);
            }

            if (gamepad1.dpad_right) {
                FL.setPower(0);
                FR.setPower(1);
                BL.setPower(0);
                BR.setPower(0);
            }

            if (gamepad1.dpad_left) {
                FL.setPower(0);
                FR.setPower(0);
                BL.setPower(1);
                BR.setPower(0);
            }

            if (gamepad1.dpad_down) {
                FL.setPower(0);
                FR.setPower(0);
                BL.setPower(0);
                BR.setPower(1);
            }

            telemetry.addData("FL", FL.getCurrentPosition());
            telemetry.addData("FR", FR.getCurrentPosition());
            telemetry.addData("BL", BL.getCurrentPosition());
            telemetry.addData("BR", BR.getCurrentPosition());

            telemetry.update();
        }
    }
}
