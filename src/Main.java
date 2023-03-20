
public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStationTransport serviceStation = new ServiceStation();

        service(serviceStation, car, bicycle, truck);
        System.out.println();
        service(serviceStation, car2, bicycle2, truck2);
    }

    private static void service(ServiceStationTransport stationTransport, Car car, Bicycle bicycle, Truck truck) {
        stationTransport.check(bicycle);
        stationTransport.check(car);
        stationTransport.check(truck);
    }
}