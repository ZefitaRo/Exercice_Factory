public class FVehicle implements IFVehicle {
    public static IVehicle creerVehicle(EVehicles type) {
        switch(type) {
            case CAR -> {
                return new Car();
            }
            case TRUCK -> {
                return new Truck();
            }
            case MOTORCYCLE -> {
                return new Motorcycle();
            }
        }
        return null;
    }
}
