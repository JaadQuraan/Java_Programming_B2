package day08_scanner_logical_operators;

public class Speeding {
    /*
    speed, speed limit, speeding boolean
    "Are you speeding" t/f
     */
    public static void main(String[] args) {
        double currentSpeed = 25;
        double speedLimit = 25;
        boolean isSpeeding = currentSpeed >= speedLimit;

        System.out.println("You are in a school zone. Are you speeding: "+isSpeeding);

    }
}
