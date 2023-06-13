package br.com.hcode.solid.abstractfactory.factories;

import br.com.hcode.solid.abstractfactory.aircrafts.Airplane;
import br.com.hcode.solid.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.solid.abstractfactory.landvehicles.Car;
import br.com.hcode.solid.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {
  @Override
  public ILandVehicle createTransportVehicle() {
    return new Car();
  }

  @Override
  public IAircraft createTransportAircraft() {
    return new Airplane();
  }
}
