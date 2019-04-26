package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.ulpgc.alu.garcia106.kilian.sprint2.app.AppMediator;
import es.ulpgc.alu.garcia106.kilian.sprint2.data.Repository;

public class PruebaSprintScreen {

  public static void configure(PruebaSprintContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    PruebaSprintState state = mediator.getPruebaSprintState();
    Repository repository = Repository.getInstance(context.get());

    PruebaSprintContract.Router router = new PruebaSprintRouter(mediator);
    PruebaSprintContract.Presenter presenter = new PruebaSprintPresenter(state);
    PruebaSprintContract.Model model = new PruebaSprintModel(repository);
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
