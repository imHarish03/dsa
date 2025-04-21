package dsa.pattern.creational.abs.factory.vms;

import dsa.pattern.creational.abs.factory.vms.four.wheeler.FourWheeler;
import dsa.pattern.creational.abs.factory.vms.four.wheeler.SUV;
import dsa.pattern.creational.abs.factory.vms.two.wheeler.Scooter;
import dsa.pattern.creational.abs.factory.vms.two.wheeler.TwoWheeler;

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
