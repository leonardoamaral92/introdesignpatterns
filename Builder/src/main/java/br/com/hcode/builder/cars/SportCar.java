package br.com.hcode.builder.cars;

import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

public class SportCar {
  private final CarType carType;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;

  private final Color color;

  public SportCar(
      CarType carType, int seats, Engine engine, Transmission transmission, Color color) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.color = color;
  }

  public String result() {
    return "Lamborghini with motor: "
        + engine.getPower()
        + "\n"
        + "transmission: "
        + transmission.name()
        + " and with color: "
        + color.getName();
  }
}
