package dsa.pattern.creational.factory.vms;

import dsa.pattern.creational.factory.vms.two.wheeler.TwoWheeler;

public class Client {
    public static void main(String[] args) {
        VehicleFactoryProvider provider = new VehicleFactoryProvider();
        VehicleFactory factory = provider.getFactory(MarketType.RURAL);

        TwoWheeler twoWheeler = factory.createTwoWheeler();
        System.out.println(twoWheeler.getDetails());
    }
}
