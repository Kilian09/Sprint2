package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

public class PruebaSprintPresenter implements PruebaSprintContract.Presenter {

  public static String TAG = PruebaSprintPresenter.class.getSimpleName();

  private WeakReference<PruebaSprintContract.View> view;
  private PruebaSprintViewModel viewModel;
  private PruebaSprintContract.Model model;
  private PruebaSprintContract.Router router;

  public PruebaSprintPresenter(PruebaSprintState state) {
    viewModel = state;
  }

  @Override
  public void injectView(WeakReference<PruebaSprintContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(PruebaSprintContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(PruebaSprintContract.Router router) {
    this.router = router;
  }

  @Override
  public void fetchData() {
    // Log.e(TAG, "fetchData()");

    // set passed state
    PruebaSprintState state = router.getDataFromPreviousScreen();
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
  public void onIncrementarButtonClicked() {
    String s = model.fetchData();
    viewModel.data = s;
    fetchData();
  }

  @Override
  public void startResetScreen() {
    router.navigateToResetScreen();
  }
}
