package oop.tasks.encapsulation_task_lms;

public class Car {
    private String nameCar;
    private String modelCar;
    private int powerCar;

    public Car() {
    }
    public Car(String nameCar, String modelCar, int powerCar) {
        this.nameCar = nameCar;
        this.modelCar = modelCar;
        this.powerCar = powerCar;
    }
    public String getNameCar() {
        return nameCar;
    }
    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }
    public String getModelCar() {
        return modelCar;
    }
    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
    public int getPowerCar() {
        return powerCar;
    }
    public void setPowerCar(int powerCar) {
        this.powerCar = powerCar;
    }
    @Override
    public String toString() {
        return "~~~~~~~~~~Car~~~~~~" +
                "NameCar: " + nameCar + '\n' +
                "ModelCar: " + modelCar + '\n' +
                "PowerCar: " + powerCar + '\n' ;
    }
}
