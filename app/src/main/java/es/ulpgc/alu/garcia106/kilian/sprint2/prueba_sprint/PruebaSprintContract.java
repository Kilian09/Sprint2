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
  }

  interface Model {
    String fetchData();
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(PruebaSprintState state);

    PruebaSprintState getDataFromPreviousScreen();
  }
}
