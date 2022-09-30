package CarInheritance;

import CarInheritance.Enums.StartType;
import CarInheritance.Enums.SteeringType;

public class XUV extends Car{
    
    XUV() {
        this.steerType = SteeringType.HYDRAULIC;
        this.startType = StartType.BUTTON;
    }

    @Override
    void start() {
        if(this.started) {
            System.out.println("Car is already started");
            return;
        }

        this.started = true;
        System.out.println("Car is started");
    }

}
