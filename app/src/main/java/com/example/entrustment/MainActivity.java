package com.example.entrustment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainPresenter.MainAction {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);

        presenter = new MainPresenter(this, this);
        presenter.onCreate();
    }

    @Override
    public void showMainFragment() {
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_fragment, fragment, "").commit();
    }
}
