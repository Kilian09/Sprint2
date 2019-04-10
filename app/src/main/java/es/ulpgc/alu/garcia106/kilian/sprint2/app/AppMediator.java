package es.ulpgc.alu.garcia106.kilian.sprint2.app;

import android.app.Application;

import es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint.PruebaSprintState;

public class AppMediator extends Application {

  private PruebaSprintState pruebaSprintState;

  @Override
  public void onCreate() {
    super.onCreate();
    pruebaSprintState = new PruebaSprintState();
  }

  public PruebaSprintState getPruebaSprintState() {
    return pruebaSprintState;
  }

  public void setPruebaSprintState(PruebaSprintState pruebaSprintState) {
    this.pruebaSprintState = pruebaSprintState;
  }
}
