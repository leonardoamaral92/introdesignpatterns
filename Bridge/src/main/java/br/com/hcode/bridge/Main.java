package br.com.hcode.bridge;

import br.com.hcode.bridge.platforms.DisneyPlus;
import br.com.hcode.bridge.platforms.Facebook;
import br.com.hcode.bridge.platforms.IPlatform;
import br.com.hcode.bridge.platforms.TwitchTV;
import br.com.hcode.bridge.platforms.Youtube;
import br.com.hcode.bridge.transmissions.RecordedLive;

public class Main {
  public static void main(String[] args) {
    startLive(new Youtube());
    startLive(new TwitchTV());
    startLive(new Facebook());
    startLive(new DisneyPlus());
  }

  public static void startLive(IPlatform platform) {
    //    System.out.println(".... Aguarde");
    //    Live live = new Live(platform);
    //    live.broadcasting();
    //    live.result();

    //    System.out.println("Transmissão avançada, aguarde....");
    //    AdvancedLive advancedLive = new AdvancedLive(platform);
    //    advancedLive.broadcasting();
    //    advancedLive.comments();
    //    advancedLive.subtitles();
    //    advancedLive.result();

    System.out.println("Transmissão gravada, aguarde....");
    RecordedLive recordedLive = new RecordedLive(platform);
    recordedLive.broadcasting();
    recordedLive.result();
    recordedLive.start();
    recordedLive.stop();
  }
}
