package br.com.hcode.solid.abstractfactory.landvehicles;

public class Car implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando trajeto.");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros e estamos prontos.");
    }
}
