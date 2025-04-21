package dsa.pattern.creational.abs.factory.vms;

public class VehicleFactoryProvider {
    public static VehicleFactory getFactory(MarketType type) {
        return switch (type) {
            case RURAL -> new RuralVehicleFactory();
            case URBAN -> new UrbanVehicleFactory();
        };
    }
}
