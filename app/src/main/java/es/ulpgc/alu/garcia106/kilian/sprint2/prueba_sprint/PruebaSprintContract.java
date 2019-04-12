package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import java.lang.ref.WeakReference;

interface PruebaSprintContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(PruebaSprintViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void fetchData();

    void onIncrementarButtonClicked();

    void startResetScreen();


  }

  interface Model {
    String fetchData();
  }

  interface Router {
    void navigateToResetScreen();

    void passDataToResetScreen(PruebaSprintState state);

    PruebaSprintState getDataFromPreviousScreen();
  }
}
