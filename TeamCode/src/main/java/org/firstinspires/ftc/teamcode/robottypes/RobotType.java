package org.firstinspires.ftc.teamcode.robottypes;

public abstract class RobotType {

    private static RobotType currentRobotType = null;       //This is set to null, therefore must be defined in robot initiation
    protected float x, y, angleOffset, width, length;

    public RobotType (float x, float y, float angleOffset, float width, float length) {
            this.x = x;                         //Center of field is (0, 0), Red alliance side is quadrant 1 and 4
            this.y = y;                         //Each floor tile is 60cm by 60cm and there are 6 tiles by 6 tiles on the field.
            this.angleOffset = angleOffset;     //Unit is degrees, point (0, 0) to (180, 0) is 0 degrees, (0, 0) to (0, 180) is 90 degrees
            this.width = width;                 //width of robot in cm
            this.length = length;               //length of robot in cm
    }

    public abstract void init();
    public abstract void moveTo(float x, float y, float targetPower);
    public abstract void turnTo(float x, float y, float targetPower);
    public abstract void turnTo(float angle, float targetPower);
    public abstract void turn(float angle, float targetPower);

    public static void setRobotType(RobotType robotType) {
        currentRobotType = robotType;
    }
    public static RobotType getRobotType() {
        return currentRobotType;
    }
}
