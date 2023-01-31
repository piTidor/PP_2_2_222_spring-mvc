package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getCarForList(int value){
        List<Car> spisok = new ArrayList<>();
        spisok.add( new Car("BMW",120, "VXC1276H989DFB" ));
        spisok.add( new Car("BMW",978, "bnC12456H99DAA" ));
        spisok.add( new Car("BMW",456, "VXC1276H989DFB" ));
        spisok.add( new Car("BMW",889, "O4NJG74359234J" ));
        spisok.add( new Car("BMW",007, "NG76LH789VTJ5K7"));
        if (value <= 5) {
        List<Car> ret = spisok.subList(0,value);
        return ret;}
        else {
            return spisok;
        }

    }
}
