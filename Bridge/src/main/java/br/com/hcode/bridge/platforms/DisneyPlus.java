package br.com.hcode.bridge.platforms;

public class DisneyPlus implements IPlatform {
  public DisneyPlus() {
    configureRMTP();
    System.out.println("DisneyPlus: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("DisneyPlus conta autorizada. ");
  }

  @Override
  public void authToken() {
    System.out.println("DisneyPlus: Autorizando aplicação");
  }
}
