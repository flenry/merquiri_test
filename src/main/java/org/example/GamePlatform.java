package org.example;

public class GamePlatform {
    public static double getFinalSpeed(double initialSpeed, int[] inclinations) {
        double speed = initialSpeed;

        for (int inclination : inclinations) {
            if (inclination < 0) {
                speed += Math.abs(inclination);
            } else if (inclination > 0) {
                speed -= inclination;
            }
        }

        return speed;
    }
    public static void main(String[] args){
        System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); //should print 45
    }
}
