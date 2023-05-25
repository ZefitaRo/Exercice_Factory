public class Truck implements IVehicle
{

    @Override
    public void startEngine()
    {
        System.out.println("Le camion démarre");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Le camion s'arrête");
    }
}
