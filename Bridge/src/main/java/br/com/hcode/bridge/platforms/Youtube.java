package br.com.hcode.bridge.platforms;

public class Youtube implements IPlatform{

    public Youtube(){
        configureRMTP();
        System.out.println("Youtube: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube conta autorizada. ");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação");
    }
}
