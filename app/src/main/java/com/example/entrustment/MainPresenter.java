package com.example.entrustment;

import android.content.Context;

public class MainPresenter implements Presenter {
    private Context c;
    private MainAction action;
    public MainPresenter(Context c, MainAction action) {
        this.c = c;
        this.action = action;
    }

    @Override
    public void onCreate() {
        action.showMainFragment();
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    public interface MainAction{
        void showMainFragment();
    }
}
