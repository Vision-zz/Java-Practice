import Enums.StartType;
import Enums.SteeringType;

abstract class Car {

    private double steeringAngle = 0.0;
    SteeringType steerType = SteeringType.MECHANICAL;
    StartType startType = StartType.KEY;
    boolean started = false;

    abstract void start();

    public void steer(double steeringAngle, int steerPower, int steerTime) {
        int requiredSteerPower = this.getSteerPower();
        if (steerPower < requiredSteerPower) {
            System.out.println("Steer power is less. Car not steered");
            return;
        }

        this.steeringAngle = steeringAngle;
        System.out.println("Steering turned to " + steeringAngle + " degrees. Steering for " + steerTime + " seconds");

        try {
            Thread.sleep(steerTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.steeringAngle = 0.0;
        System.out.println("Steering moved back to normal position.");
    }

    public void currentSteer() {
        System.out.println(this.steeringAngle);
    }
    
    public void carStartType() {
        System.out.println(this.startType);
    }

    private int getSteerPower() {
        switch (this.steerType) {
            case POWER:
                return 5;
            case HYDRAULIC:
                return 1;
            default:
                return 10;
        }
    }
}