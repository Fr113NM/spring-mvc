package web.model;

import java.util.Objects;

public class Car {
    private int series;
    private String model;
    private int speed;

    public Car() {
    }

    public Car(int series, String model, int speed) {
        this.series = series;
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed &&
                Objects.equals(series, car.series) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, model, speed);
    }
}
