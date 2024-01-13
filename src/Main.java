public class Main {

    public static ServiceStation station = new ServiceStation();

    public static void main(String[] args) {
        Car audi = new Car("Audi", 4);
        Car bmw = new Car("BMW", 4);

        Truck mercedes = new Truck("Mercedes", 3);
        Truck hongoi = new Truck("Hongoi", 3);

        Bicycle lets = new Bicycle("Lets", 2);
        Bicycle freman = new Bicycle("Freman", 2);


        station.check(audi);
        station.check(bmw);
        station.check(mercedes);
        station.check(hongoi);
        station.check(lets);
        station.check(freman);
    }
}