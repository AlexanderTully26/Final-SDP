package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Test extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        MecanumKinematics mecanumKinematics = new MecanumKinematics(hardwareMap);


        waitForStart();
        while(opModeIsActive()) {
            mecanumKinematics.MecanumFOR(5);
            mecanumKinematics.MecanumRIGHT(12);
            for (int i = 1; i < 5; i++) {
                mecanumKinematics.MecanumFOR(20);
                mecanumKinematics.MecanumLEFT(24);
                mecanumKinematics.MecanumBACK(20);
                mecanumKinematics.MecanumRIGHT(24);
            }

            /*
            mecanumKinematics.MecanumLEFT(12);
            for (int i = 1; i < 5; i++) {
                mecanumKinematics.MecanumFOR(20);
                mecanumKinematics.MecanumRIGHT(24);
                mecanumKinematics.MecanumBACK(20);
                mecanumKinematics.MecanumLEFT(24);
            }*/
        }
    }
}
