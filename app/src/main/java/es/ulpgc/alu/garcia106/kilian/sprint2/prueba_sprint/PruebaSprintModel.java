package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class PruebaSprintModel implements PruebaSprintContract.Model {

  public static String TAG = PruebaSprintModel.class.getSimpleName();

  public PruebaSprintModel() {

  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");
    return "Hello";
  }
}
