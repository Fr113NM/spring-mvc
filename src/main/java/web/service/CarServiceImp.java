package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(63, "GWagen", 270));
        cars.add(new Car(2, "Hummer", 240));
        cars.add(new Car(62, "Maybach", 340));
        cars.add(new Car(9, "Cadillac", 290));
        cars.add(new Car(112, "Pony Car", 320));

        count = count == null ? cars.size() : count;

        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
