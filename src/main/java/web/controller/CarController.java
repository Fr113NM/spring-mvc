package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceImp;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap car) {
        ServiceImp service = new ServiceImp();
        List<Car> list = service.printCar(count);
        car.addAttribute("messages", list);
        return "cars";
    }
}
