package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.alu.garcia106.kilian.sprint2.R;

public class ResetActivity
    extends AppCompatActivity implements ResetContract.View {

  public static String TAG = ResetActivity.class.getSimpleName();

  private ResetContract.Presenter presenter;

  TextView clicksText;
  Button reset;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_reset);

    clicksText = findViewById(R.id.clicksText);
    reset = findViewById(R.id.reset);

    getSupportActionBar().setTitle("Reset");

    reset.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        presenter.startPreviousScreen();
      }
    });

    // do the setup
    ResetScreen.configure(this);

    presenter.fetchData();
  }


  @Override
  public void injectPresenter(ResetContract.Presenter presenter) {
    this.presenter = presenter;
  }

  @Override
  public void displayData(ResetViewModel viewModel) {
    //Log.e(TAG, "displayData()");

    ((TextView) findViewById(R.id.clicksText)).setText(viewModel.data);
    ((Button) findViewById(R.id.reset)).setText(R.string.reset_text_label);
  }
}
