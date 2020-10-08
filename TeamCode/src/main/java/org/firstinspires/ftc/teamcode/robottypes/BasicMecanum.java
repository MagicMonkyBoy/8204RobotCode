package org.firstinspires.ftc.teamcode.robottypes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class BasicMecanum extends RobotType {

    public DcMotor fLMotor, fRMotor, bLMotor, bRMotor;          // f = front, b = back, L = left, R = Right
                                                                // these are unique to the child class and are not abstract

    public BasicMecanum(double x, double y, double angleOffset, double width, double length) {
        super(x, y, angleOffset, width, length);
    }

    @Override
    public void init(HardwareMap hardwareMap) {
        fLMotor = hardwareMap.get(DcMotor.class, "fLMotor");        //device name might vary depending on value put into phone
        fRMotor = hardwareMap.get(DcMotor.class, "fRMotor");
        bLMotor = hardwareMap.get(DcMotor.class, "bLMotor");
        bRMotor = hardwareMap.get(DcMotor.class, "bRMotor");

        fLMotor.setPower(0);
        fRMotor.setPower(0);
        bLMotor.setPower(0);
        bRMotor.setPower(0);
    }

    @Override
    public void moveTo(double x, double y, double targetPower) {

    }

    @Override
    public void turnTo(double x, double y, double targetPower) {

    }

    @Override
    public void turnTo(double angle, double targetPower) {

    }

    @Override
    public void turn(double angle, double targetPower) {

    }
}
