package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import es.ulpgc.alu.garcia106.kilian.sprint2.R;

public class PruebaSprintActivity
    extends AppCompatActivity implements PruebaSprintContract.View {

  public static String TAG = PruebaSprintActivity.class.getSimpleName();

  private PruebaSprintContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_prueba_sprint);

    // do the setup
    PruebaSprintScreen.configure(this);
  }

  @Override
  protected void onResume() {
    super.onResume();

    // do some work
    presenter.fetchData();
  }

  @Override
  public void injectPresenter(PruebaSprintContract.Presenter presenter) {
    this.presenter = presenter;
  }

  @Override
  public void displayData(PruebaSprintViewModel viewModel) {
    //Log.e(TAG, "displayData()");

    // deal with the data
    ((TextView) findViewById(R.id.data)).setText(viewModel.data);
  }
}
