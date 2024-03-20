package car.application.serviceImpl;

import car.application.Dto.CarDto;
import car.application.Dto.StatusResponce;
import car.application.modle.Car;
import car.application.repo.CarRepo;
import car.application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImple implements CarService {


    @Autowired
    CarRepo carRepo ;


    @Override
    public StatusResponce addCar(CarDto carDto) {

        Car car = convertDtoToEntity(carDto);
        carRepo.save(car);

        return new StatusResponce(201 , "Car Added" , "Success");
    }


   public Car convertDtoToEntity(CarDto dto)
    {
        Car car = new Car();


        car.setCarModelName(dto.getCarModelName());
        car.setBrandName(dto.getBrandName());
        car.setFule(dto.getFuel());
        car.setKms(dto.getKms());
        car.setPrice(dto.getPrice());
        car.setYear(dto.getYear());

        return car;
    }

    public CarDto convertEntityToDto(Car car)
    {
        CarDto dto = new CarDto();


        dto.setCarModelName(car.getCarModelName());
        dto.setBrandName(car.getBrandName());
        dto.setFuel(car.getFule());
        dto.setKms(car.getKms());
        dto.setPrice(car.getPrice());
        dto.setYear(car.getYear());

        return dto;
    }

    @Override
    public CarDto getCar(int id) {


        Optional<Car> carById = carRepo.findById(id);

        CarDto carDto = convertEntityToDto(carById.get());

        return  carDto ;

    }
}
