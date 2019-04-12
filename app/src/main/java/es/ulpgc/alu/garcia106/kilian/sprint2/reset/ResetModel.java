package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class ResetModel implements ResetContract.Model {

  public static String TAG = ResetModel.class.getSimpleName();

  int i = 0;

  public ResetModel() {

  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");

    return "hello";
  }
}

