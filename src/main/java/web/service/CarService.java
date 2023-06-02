package web.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import web.model.Car;

public class CarService {
    private List<Car> cars = new ArrayList<>();
    public List<Car> getCars(int i) {
        cars.add(new Car("red", "A", 1));
        cars.add(new Car("orange", "B", 1));
        cars.add(new Car("yellow", "C", 1));
        cars.add(new Car("green", "A", 2));
        cars.add(new Car("blue", "A", 3));

        if (i == 0 || i > 5) {
            return cars;
        }
        return cars.stream().limit(i).collect(Collectors.toList());
    }
}
