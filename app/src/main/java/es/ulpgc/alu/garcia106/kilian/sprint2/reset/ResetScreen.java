package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.ulpgc.alu.garcia106.kilian.sprint2.app.AppMediator;
import es.ulpgc.alu.garcia106.kilian.sprint2.data.Repository;

public class ResetScreen {

  public static void configure(ResetContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    ResetState state = mediator.getResetState();
    Repository repository = Repository.getInstance(context.get());

    ResetContract.Router router = new ResetRouter(mediator);
    ResetContract.Presenter presenter = new ResetPresenter(state);
    ResetContract.Model model = new ResetModel(repository);
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
