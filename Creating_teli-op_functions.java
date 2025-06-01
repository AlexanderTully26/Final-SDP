package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumKinematics {
    private double inPerTick;
    DcMotorEx FL, FR, BL, BR;

    public MecanumKinematics(HardwareMap hardwareMap) {
        FL = hardwareMap.get(DcMotorEx.class, "FL");
        FR = hardwareMap.get(DcMotorEx.class, "FR");
        BL = hardwareMap.get(DcMotorEx.class, "BL");
        BR = hardwareMap.get(DcMotorEx.class, "BR");

        FL.setDirection(DcMotorSimple.Direction.REVERSE);
        BL.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void MecanumFOR(double distance) {

        double ticks = inPerTick * distance;
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        while (Math.abs(ticks - FL.getCurrentPosition()) > 10) {
            FL.setPower(0.5);
            FR.setPower(0.5);
            BL.setPower(0.5);
            BR.setPower(0.5);
        }
        FL.setPower(0);
        FR.setPower(0);
        BL.setPower(0);
        BR.setPower(0);

    }

    public void MecanumBACK(double distance) {

        double ticks = inPerTick * distance;
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        while (Math.abs(ticks - FL.getCurrentPosition()) > 10) {
            FL.setPower(-0.5);
            FR.setPower(-0.5);
            BL.setPower(-0.5);
            BR.setPower(-0.5);
        }
        FL.setPower(0);
        FR.setPower(0);
        BL.setPower(0);
        BR.setPower(0);

    }

    public void MecanumLEFT(double distance) {

        double ticks = inPerTick * distance;
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        while (Math.abs(ticks - FL.getCurrentPosition()) > 10) {
            FL.setPower(0.5);
            FR.setPower(-0.5);
            BL.setPower(-0.5);
            BR.setPower(0.5);
        }
        FL.setPower(0);
        FR.setPower(0);
        BL.setPower(0);
        BR.setPower(0);
    }

    public void MecanumRIGHT(double distance) {

        double ticks = inPerTick * distance;
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        while (Math.abs(ticks - FL.getCurrentPosition()) > 10) {
            FL.setPower(-0.5);
            FR.setPower(0.5);
            BL.setPower(0.5);
            BR.setPower(-0.5);
        }
        FL.setPower(0);
        FR.setPower(0);
        BL.setPower(0);
        BR.setPower(0);

    }

}
