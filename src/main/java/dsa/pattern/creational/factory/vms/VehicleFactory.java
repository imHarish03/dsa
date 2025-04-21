package dsa.pattern.creational.factory.vms;

import dsa.pattern.creational.factory.vms.four.wheeler.FourWheeler;
import dsa.pattern.creational.factory.vms.two.wheeler.TwoWheeler;

public interface VehicleFactory {
    TwoWheeler createTwoWheeler();
    FourWheeler createFourWheeler();
}
