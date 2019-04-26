package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import java.lang.ref.WeakReference;

import es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint.PruebaSprintState;

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

    void startPreviousScreen();
  }

  interface Model {
    String fetchData();

    void resetAll();
  }

  interface Router {
    void navigateToPreviewScreen();

    void passDataToNextScreen(PruebaSprintState state);

    PruebaSprintState getPruebaSprintState();
  }
}
