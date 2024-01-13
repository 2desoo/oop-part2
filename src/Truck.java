public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп - прицеп закреплен");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем трактор: " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkTrailer();
        checkEngine();
    }
}