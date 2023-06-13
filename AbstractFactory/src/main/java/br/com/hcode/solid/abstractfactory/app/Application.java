package br.com.hcode.solid.abstractfactory.app;

import br.com.hcode.solid.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.solid.abstractfactory.factories.ITransportFactory;
import br.com.hcode.solid.abstractfactory.landvehicles.ILandVehicle;

public class Application {

  private ILandVehicle vehicle;
  private IAircraft aircraft;

  public Application(ITransportFactory factory) {
    vehicle = factory.createTransportVehicle();
    aircraft = factory.createTransportAircraft();
  }

  public void startRoute() {
    vehicle.startRoute();
    aircraft.startRoute();
  }
}
