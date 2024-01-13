public class Car extends Bicycle {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверка двигателя - двигатель исправен");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем машину: " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}