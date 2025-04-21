package dsa.pattern.creational.factory.vms;

public class VehicleFactoryProvider {
    public static VehicleFactory getFactory(MarketType type) {
        return switch (type) {
            case RURAL -> new RuralVehicleFactory();
            case URBAN -> new UrbanVehicleFactory();
        };
    }
}
