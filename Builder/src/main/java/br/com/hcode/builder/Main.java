package br.com.hcode.builder;

import br.com.hcode.builder.builders.CarBuilder;
import br.com.hcode.builder.builders.SportCarBuilder;
import br.com.hcode.builder.builders.TruckBuilder;
import br.com.hcode.builder.cars.Car;
import br.com.hcode.builder.cars.SportCar;
import br.com.hcode.builder.cars.Truck;
import br.com.hcode.builder.director.Director;

public class Main {
  public static void main(String[] args) {

    Director director = new Director();
    // Criando o carro
    CarBuilder builder = new CarBuilder();
    director.constructSedanCar(builder);

    Car car = builder.getResult();
    System.out.println(car.getCarType() + " produzido com sucesso");

    // Criado o caminhao
    TruckBuilder truckBuilder = new TruckBuilder();
    director.constructTruck(truckBuilder);

    Truck truck = truckBuilder.getResult();
    System.out.println("Caminhão: " + truck.result());

    // Criando um carro esportivo
    // 2 assentos, 4 mil de força no motor, cor amarelo
    SportCarBuilder sportCarBuilder = new SportCarBuilder();
    director.constructSportCar(sportCarBuilder);
    SportCar lamborghini = sportCarBuilder.getResult();
    System.out.println(lamborghini.result());
  }
}
