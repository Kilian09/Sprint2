package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint.PruebaSprintState;

public class ResetPresenter implements ResetContract.Presenter {

  public static String TAG = ResetPresenter.class.getSimpleName();

  private WeakReference<ResetContract.View> view;
  private ResetViewModel viewModel;
  private ResetContract.Model model;
  private ResetContract.Router router;

  public ResetPresenter(ResetState state) {
    viewModel = state;
  }

  @Override
  public void injectView(WeakReference<ResetContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ResetContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(ResetContract.Router router) {
    this.router = router;
  }

  @Override
  public void fetchData() {
    // Log.e(TAG, "fetchData()");

    // set passed state
    PruebaSprintState state = router.getPruebaSprintState();
    if (state != null) {
      viewModel.data = state.data;
    }

    if (viewModel.data == null) {
      // call the model
      String data = model.fetchData();

      // set initial state
      viewModel.data = data;
    }

    // update the view
    view.get().displayData(viewModel);

  }

  @Override
  public void startPreviousScreen() {
    model.resetAll();
    PruebaSprintState state = router.getPruebaSprintState();
    state.data = "0";
    state.clicks = "0";
    router.passDataToNextScreen(state);
    router.navigateToPreviewScreen();
  }
}
