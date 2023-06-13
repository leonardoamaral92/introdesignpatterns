package br.com.hcode.solid.abstractfactory;

import br.com.hcode.solid.abstractfactory.app.Application;
import br.com.hcode.solid.abstractfactory.factories.ITransportFactory;
import br.com.hcode.solid.abstractfactory.factories.NineNineTransport;
import br.com.hcode.solid.abstractfactory.factories.UberTransport;

public class Main {

  public static Application configureApp(String company) {
    ITransportFactory factory;

    if ("uber".equals(company)) factory = new UberTransport();
    else factory = new NineNineTransport();

    return new Application(factory);
  }

  public static void main(String[] args) {
    Application app = configureApp("99");
    app.startRoute();
  }
}
