package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import java.lang.ref.WeakReference;

interface ResetContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(ResetViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void fetchData();

    void startPresenterSprintScreen();
  }

  interface Model {
    String fetchData();
  }

  interface Router {
    void navigateToPruebaSprintScreen();

    void passDataToNextScreen(ResetState state);

    ResetState getDataFromPruebaSprintScreen();
  }
}
