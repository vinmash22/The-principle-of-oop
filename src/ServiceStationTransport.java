public interface ServiceStationTransport {
    void check(Car car);
    void check(Truck truck);
    void check(Bicycle bicycle);
}