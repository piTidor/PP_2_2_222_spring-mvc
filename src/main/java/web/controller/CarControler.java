package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarControler {
    @GetMapping(value = "/cars")
    public String printWelcome(HttpServletRequest request, ModelMap model) {
        int count ;
        if (request.getParameter("count") == null){
            count = 5;
        } else {
            count = Integer.parseInt(request.getParameter("count"));
        }
        List<Car> spisok = CarService.getCarForList(count);
        model.addAttribute("cars", spisok);


        return "cars";
    }
//    @GetMapping("={count}")
//    public String printCar(ModelMap model,@PathVariable int count){
//        List<Car> spisok = CarService.getCarForList(count);
//        model.addAttribute("cars", spisok);
//        return "cars";
//    }
//    	@GetMapping(value = "/")
//	    public String Hello(ModelMap model) {
//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm Spring MVC application");
//		messages.add("5.2.0 version by sep'19 ");
//		model.addAttribute("messages", messages);
//		return "index";
//	}
}
