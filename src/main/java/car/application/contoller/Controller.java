package car.application.contoller;


import car.application.Dto.CarDto;
import car.application.Dto.StatusResponce;
import car.application.service.CarService;
import car.application.serviceImpl.CarServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Controller {


    @Autowired
    CarService carService ;


    @GetMapping("/hh")
    public String dd()
    {
        return " Welcome";
    }


    @PostMapping("/add")
    public StatusResponce addCar(@RequestBody CarDto carDto)
    {
        StatusResponce statusResponce = carService.addCar(carDto);

        return statusResponce;
//        return new ResponseEntity<>(statusResponce , HttpStatus.CREATED) ;
    }

    @GetMapping("/getCar/{id}")
    public CarDto getCarById(@PathVariable int id)
    {
        CarDto car = carService.getCar(id);

        return car ;
    }


}
