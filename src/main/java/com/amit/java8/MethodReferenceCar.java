package com.amit.java8;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Data
public class MethodReferenceCar {

    private String name;

    public static MethodReferenceCar create(Supplier<MethodReferenceCar> car){
        return car.get();
    }

    public static void repair(final MethodReferenceCar car){
        System.out.println("Repairing car : " + car.toString());
    }

    public void collide(final MethodReferenceCar car){
        System.out.println("Colliding with car : " + car.toString());
    }

    public void stop(){
        System.out.println("Stopping car " + this.toString());
    }


    public static void main(String[] args) {

        MethodReferenceCar car = MethodReferenceCar.create(MethodReferenceCar::new);
        car.setName("Ferrari");

        MethodReferenceCar newCar = MethodReferenceCar.create(MethodReferenceCar::new);
        newCar.setName("Renault");

        List<MethodReferenceCar> cars = Arrays.asList(car);
        cars.stream().forEach(MethodReferenceCar::repair);
        cars.stream().forEach(MethodReferenceCar::stop);
        cars.stream().forEach(newCar::collide);

    }

}
