public class Motorcycle implements IVehicle
{
    @Override
    public void startEngine()
    {
        System.out.println("La moto démarre");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("La moto s'arrête");
    }
}
