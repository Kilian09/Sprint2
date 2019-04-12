package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.alu.garcia106.kilian.sprint2.app.AppMediator;
import es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint.PruebaSprintActivity;

public class ResetRouter implements ResetContract.Router {

  public static String TAG = ResetRouter.class.getSimpleName();

  private AppMediator mediator;

  public ResetRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToPruebaSprintScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, PruebaSprintActivity.class);
    context.startActivity(intent);
  }

  @Override
  public void passDataToNextScreen(ResetState state) {
    mediator.setResetState(state);
  }

  @Override
  public ResetState getDataFromPruebaSprintScreen() {
    ResetState state = mediator.getResetState();
    return state;
  }
}
