package br.com.hcode.bridge.transmissions;

import br.com.hcode.bridge.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live(IPlatform platform) {
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("================ Iniciando transmissão.");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
