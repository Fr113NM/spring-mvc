package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String models;
    private int speed;
    private int series;

    public Car(String models, int speed, int series) {
        this.models = models;
        this.speed = speed;
        this.series = series;
    }

    public Car() {
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car model: " + getModels() + ", speed: " + getSpeed() + ", series: " + getSeries();
    }
}
