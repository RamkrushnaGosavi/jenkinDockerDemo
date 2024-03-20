package car.application.service;


import car.application.Dto.CarDto;
import car.application.Dto.StatusResponce;
import org.springframework.stereotype.Service;


public interface CarService {

    public StatusResponce addCar(CarDto carDto);
    public CarDto getCar(int id);

}
