package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Audi", "black"));
        cars.add(new Car(2, "BMW", "green"));
        cars.add(new Car(3, "Chrysler", "white"));
        cars.add(new Car(4, "Dodge", "red"));
        cars.add(new Car(5, "Ford", "grey"));
    }

    @Override
    public List<Car> getCar(int count) {
        List<Car> carList = new ArrayList<>();
        if (count < cars.size()) {
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));
            }
            return carList;
        } else {
            return cars;
        }
    }

    public List<String> carToString(List<Car> carList2) {
        List<String> carToStringList = new ArrayList<>();
        for (Car car : carList2) {
            carToStringList.add(car.toString());
        }
        return carToStringList;
    }

    public List<Car> getCarList() {
        return cars;
    }
}
