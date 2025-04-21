package dsa.pattern.creational.factory.vms;

import dsa.pattern.creational.factory.vms.four.wheeler.FourWheeler;
import dsa.pattern.creational.factory.vms.four.wheeler.SUV;
import dsa.pattern.creational.factory.vms.two.wheeler.Bike;
import dsa.pattern.creational.factory.vms.two.wheeler.Scooter;
import dsa.pattern.creational.factory.vms.two.wheeler.TwoWheeler;

public class RuralVehicleFactory implements VehicleFactory {
    @Override
    public TwoWheeler createTwoWheeler() {
        return new Bike();
    }

    @Override
    public FourWheeler createFourWheeler() {
        return new SUV();
    }
}
