package br.com.hcode.solid.abstractfactory.factories;

import br.com.hcode.solid.abstractfactory.aircrafts.Helicopter;
import br.com.hcode.solid.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.solid.abstractfactory.landvehicles.ILandVehicle;
import br.com.hcode.solid.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
  @Override
  public ILandVehicle createTransportVehicle() {
    return new Motorcycle();
  }

  @Override
  public IAircraft createTransportAircraft() {
    return new Helicopter();
  }
}
