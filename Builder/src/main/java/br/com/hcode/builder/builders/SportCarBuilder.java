package br.com.hcode.builder.builders;

import br.com.hcode.builder.cars.SportCar;
import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Color;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

public class SportCarBuilder implements IBuilder {
  private CarType carType;
  private int seats;
  private Transmission transmission;
  private Engine engine;
  private Color color;

  @Override
  public void setCarType(CarType type) {
    this.carType = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setColor(Color color) {
    this.color = color;
  }

  public SportCar getResult() {
    return new SportCar(carType, seats, engine, transmission, color);
  }
}
