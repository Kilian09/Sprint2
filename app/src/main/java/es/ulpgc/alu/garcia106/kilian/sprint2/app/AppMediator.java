package es.ulpgc.alu.garcia106.kilian.sprint2.app;

import android.app.Application;

import es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint.PruebaSprintState;
import es.ulpgc.alu.garcia106.kilian.sprint2.reset.ResetState;

public class AppMediator extends Application {

  private PruebaSprintState pruebaSprintState;
  private ResetState resetState;

  @Override
  public void onCreate() {
    super.onCreate();
    pruebaSprintState = new PruebaSprintState();
    resetState = new ResetState();
  }

  public PruebaSprintState getPruebaSprintState() {
    return pruebaSprintState;
  }

  public void setPruebaSprintState(PruebaSprintState pruebaSprintState) {
    this.pruebaSprintState = pruebaSprintState;
  }

  public ResetState getResetState() {
    return resetState;
  }

  public void setResetState(ResetState resetState) {
    this.resetState = resetState;
  }
}
