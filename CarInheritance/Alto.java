package CarInheritance;

import java.util.Scanner;

import CarInheritance.Enums.StartType;
import CarInheritance.Enums.SteeringType;

public class Alto extends Car {

    boolean keyInserted = false;

    Alto() {
        this.steerType = SteeringType.POWER;
        this.startType = StartType.KEY;
    }

    @Override
    void start() {

        if (this.started) {
            System.out.println("Car is already started");
            return;
        }

        if (!keyInserted) {
            Scanner s = new Scanner(System.in);

            System.out.println("Type [Y] to insert the key or [N] to quit");
            String input = s.nextLine();
            s.close();

            if (input.equals("N")) {
                System.out.println("Car not started as key is not inserted");
                return;
            } else {
                this.keyInserted = true;
                System.err.println("Key inserted");
            }
        }

        this.started = true;
        System.out.println("Car is started");
    }

}
