package web.carService;

import web.models.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars(int count);
}
