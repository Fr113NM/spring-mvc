package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImp implements CarService {

    private Car car;

    @Override
    public List<Car> listCar() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("GWagen", 270, 63));
        list.add(new Car("Hummer", 240, 2));
        list.add(new Car("Maybach", 340, 62));
        list.add(new Car("Cadillac", 290, 9));
        list.add(new Car("Pony Car", 320, 112));
        return list;
    }

    @Override
    public List<Car> printCar(int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(listCar().get(i));
        }
        return list;
    }
}
