package com.example.mvvmstarter.features.Ui;

import android.os.Bundle;

import com.example.mvvmstarter.R;
import com.example.mvvmstarter.features.ViewModel.MainViewModel;
import com.example.mvvmstarter.features.ViewModel.ViewModelProviderFactory;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {


    @Inject
    ViewModelProviderFactory viewModelProviderFactory;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(MainViewModel.class);
    }
}
