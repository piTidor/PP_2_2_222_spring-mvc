package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarControler {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<Car> spisok = CarService.getCarForList(5);
        model.addAttribute("cars", spisok);


        return "cars";
    }
    @GetMapping("cars={count}")
    public String printCar(ModelMap model,@PathVariable int count){
        List<Car> spisok = CarService.getCarForList(count);
        model.addAttribute("cars", spisok);


        return "cars";
    }
}
