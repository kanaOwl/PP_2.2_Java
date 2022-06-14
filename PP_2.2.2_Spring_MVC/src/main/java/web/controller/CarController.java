package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    CarServiceImpl carServiceImpl = new CarServiceImpl();
    @GetMapping("/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carServiceImpl.carToString(carServiceImpl.getCarList()));
        return "cars";
    }

    @GetMapping("/car")
    public String printCarsCount(@RequestParam("count") ModelMap model, int count) {
        model.addAttribute("car", carServiceImpl.carToString(carServiceImpl.getCar(count)));
        return "car";
    }
}
