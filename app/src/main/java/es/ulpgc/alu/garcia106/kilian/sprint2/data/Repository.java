package es.ulpgc.alu.garcia106.kilian.sprint2.data;

import android.content.Context;

public class Repository {
  private String i;
  private String clicks;
  private Context context;
  public static Repository INSTANCE;

  public static Repository getInstance(Context context) {
    if (INSTANCE == null) {
      INSTANCE = new Repository(context);
    }
    return INSTANCE;
  }

  public Repository(Context context) {
    this.i = "0";
    this.clicks = "0";
  }

  public String getIncremento() {
    return i;
  }

  public void setIncremento(String i) {
    this.i = i;
  }

  public String getClicks() {
    return clicks;
  }

  public void setClicks(String clicks) {
    this.clicks = clicks;
  }

  public String incrementar() {
    int a = Integer.parseInt(getIncremento());
    if (a < 9){
      a++;
    }else{
      a=0;
    }
    setIncremento("" + a);
    return i;
  }

  public void addClicks() {
    int a = Integer.parseInt(getClicks());
    a++;
    setClicks("" + a);
  }
}
