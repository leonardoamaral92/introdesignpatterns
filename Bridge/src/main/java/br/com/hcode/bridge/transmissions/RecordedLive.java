package br.com.hcode.bridge.transmissions;

import br.com.hcode.bridge.platforms.IPlatform;

public class RecordedLive extends Live {
  public RecordedLive(IPlatform platform) {
    super(platform);
  }

  public void start() {
    System.out.println("Iniciando gravação da Live...");
  }

  public void stop() {
    System.out.println("Parando gravação da live...");
  }
}
