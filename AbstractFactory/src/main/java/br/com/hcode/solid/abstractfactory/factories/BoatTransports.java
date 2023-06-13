package br.com.hcode.solid.abstractfactory.factories;

import br.com.hcode.solid.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.solid.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransports implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return null;
    }

    @Override
    public IAircraft createTransportAircraft() {
        return null;
    }
}
