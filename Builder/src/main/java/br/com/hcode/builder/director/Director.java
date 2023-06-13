package br.com.hcode.builder.director;

import br.com.hcode.builder.builders.IBuilder;
import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

public class Director {

  public void constructSedanCar(IBuilder builder) {
    builder.setCarType(CarType.SEDAN);
    builder.setSeats(5);
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setEngine(new Engine(1600));
    builder.setColor(new Color("Azul"));
  }

  public void constructTruck(IBuilder builder) {
    builder.setCarType(CarType.TRUCK);
    builder.setSeats(5);
    builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
    builder.setEngine(new Engine(3000));
    builder.setColor(new Color("Branco"));
  }

  public void constructSportCar(IBuilder builder) {
    builder.setCarType(CarType.SPORTCAR);
    builder.setSeats(2);
    builder.setTransmission(Transmission.MANUAL);
    builder.setEngine(new Engine(4000));
    builder.setColor(new Color("Amarelo"));
  }
}
