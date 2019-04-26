package es.ulpgc.alu.garcia106.kilian.sprint2.reset;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import es.ulpgc.alu.garcia106.kilian.sprint2.data.Repository;

public class ResetModel implements ResetContract.Model {

  public static String TAG = ResetModel.class.getSimpleName();

  public Repository repository;

  public ResetModel(Repository repository) {
    this.repository = repository;
  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");

    return "hello";
  }

  @Override
  public void resetAll(){
    repository.setClicks("0");
    repository.setIncremento("0");
  }
}

