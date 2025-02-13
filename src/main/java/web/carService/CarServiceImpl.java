package web.carService;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "Toyota", "RAV-4", 2020));
        cars.add(new Car(++CAR_COUNT, "Honda", "Accord", 2022));
        cars.add(new Car(++CAR_COUNT, "Audi", "A5", 2023));
        cars.add(new Car(++CAR_COUNT, "BMW", "320", 2019));
        cars.add(new Car(++CAR_COUNT, "Lada", "Granta", 2010));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
