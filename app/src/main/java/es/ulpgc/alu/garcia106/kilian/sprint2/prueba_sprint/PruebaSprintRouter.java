package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.alu.garcia106.kilian.sprint2.app.AppMediator;

public class PruebaSprintRouter implements PruebaSprintContract.Router {

  public static String TAG = PruebaSprintRouter.class.getSimpleName();

  private AppMediator mediator;

  public PruebaSprintRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, PruebaSprintActivity.class);
    context.startActivity(intent);
  }

  @Override
  public void passDataToNextScreen(PruebaSprintState state) {
    mediator.setPruebaSprintState(state);
  }

  @Override
  public PruebaSprintState getDataFromPreviousScreen() {
    PruebaSprintState state = mediator.getPruebaSprintState();
    return state;
  }
}
