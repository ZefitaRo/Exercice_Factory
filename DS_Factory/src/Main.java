public class Main {
    public static void main(String[] args) {
        Car car = (Car) FVehicle.creerVehicle(EVehicles.CAR);
        Truck truck = (Truck) FVehicle.creerVehicle(EVehicles.TRUCK);
        Motorcycle motorcycle = (Motorcycle) FVehicle.creerVehicle(EVehicles.MOTORCYCLE);

        car.startEngine();
        car.stopEngine();

        truck.startEngine();
        truck.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}