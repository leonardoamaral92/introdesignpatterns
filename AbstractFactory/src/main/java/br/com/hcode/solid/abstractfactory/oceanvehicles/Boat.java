package br.com.hcode.solid.abstractfactory.oceanvehicles;

public class Boat implements IOceanVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando trajeto marítimo");
    }

    @Override
    public void getCargo() {
        System.out.println("Carregando carga.");
    }
}
