package dsa.pattern.creational.abs.factory.vms;

import dsa.pattern.creational.abs.factory.vms.four.wheeler.FourWheeler;
import dsa.pattern.creational.abs.factory.vms.two.wheeler.TwoWheeler;

public interface VehicleFactory {
    TwoWheeler createTwoWheeler();
    FourWheeler createFourWheeler();
}
