public class Car implements IVehicle {
    @Override
    public void startEngine() {
        System.out.println("La voiture démarre");
    }

    @Override
    public void stopEngine() {
        System.out.println("La voiture s'arrête");
    }
}
