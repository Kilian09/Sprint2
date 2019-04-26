package es.ulpgc.alu.garcia106.kilian.sprint2.prueba_sprint;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import es.ulpgc.alu.garcia106.kilian.sprint2.data.Repository;

public class PruebaSprintModel implements PruebaSprintContract.Model {

  public static String TAG = PruebaSprintModel.class.getSimpleName();

  public Repository repository;

  public PruebaSprintModel(Repository repository) {
    this.repository = repository;
  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");
    return repository.incrementar();
  }

  @Override
  public void incrementar() {
    repository.incrementar();
  }

  @Override
  public void addClicks() {
    repository.addClicks();
  }

  @Override
  public String getIncremento() {
    return repository.getIncremento();
  }

  @Override
  public String getClicks() {
    return repository.getClicks();
  }

}

