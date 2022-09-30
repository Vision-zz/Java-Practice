package CarInheritance;

import CarInheritance.Enums.StartType;
import CarInheritance.Enums.SteeringType;

public class XUV extends Car{
    
    XUV() {
        super(StartType.BUTTON, SteeringType.HYDRAULIC);
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
