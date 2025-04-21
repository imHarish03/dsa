package dsa.pattern.creational.abs.factory.vms;

import dsa.pattern.creational.abs.factory.vms.two.wheeler.TwoWheeler;

public class Client {
    public static void main(String[] args) {
        VehicleFactory factory = VehicleFactoryProvider.getFactory(MarketType.RURAL);

        TwoWheeler twoWheeler = factory.createTwoWheeler();
        System.out.println(twoWheeler.getDetails());
    }
}
