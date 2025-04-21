package dsa.pattern.creational.abs.factory.vms;

import dsa.pattern.creational.abs.factory.vms.four.wheeler.FourWheeler;
import dsa.pattern.creational.abs.factory.vms.four.wheeler.SUV;
import dsa.pattern.creational.abs.factory.vms.two.wheeler.Bike;
import dsa.pattern.creational.abs.factory.vms.two.wheeler.TwoWheeler;

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
