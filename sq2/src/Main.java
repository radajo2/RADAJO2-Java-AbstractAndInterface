interface TransportationMode{
    void transport(int budget, int car, int bus, int train, int plane);

}

class VehicleMode implements TransportationMode{
    @Override
    public void transport(int budget, int car, int bus, int train, int plane){
        if(car<=budget)
        {
            System.out.println("Car");
        }
        if(bus<=budget)
        {
            System.out.println("Bus");
        }
        if(train<=budget)
        {
            System.out.println("Train");
        }
        if(plane<=budget)
        {
            System.out.println("Plane");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        TransportationMode transportationMode = new VehicleMode();
        int budget = 500;
        int car = 500;
        int bus = 300;
        int train = 400;
        int plane = 1000;
        System.out.println(budget + " budget of Xiaoming can ride below vehicles:");
        transportationMode.transport(budget, car, bus, train, plane);
    }
}