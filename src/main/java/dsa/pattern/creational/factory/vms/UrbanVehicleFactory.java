package dsa.pattern.creational.factory.vms;

import dsa.pattern.creational.factory.vms.four.wheeler.FourWheeler;
import dsa.pattern.creational.factory.vms.four.wheeler.SUV;
import dsa.pattern.creational.factory.vms.two.wheeler.Scooter;
import dsa.pattern.creational.factory.vms.two.wheeler.TwoWheeler;

public class UrbanVehicleFactory implements VehicleFactory{
    @Override
    public TwoWheeler createTwoWheeler() {
        return new Scooter();
    }

    @Override
    public FourWheeler createFourWheeler() {
        return new SUV();
    }
}
