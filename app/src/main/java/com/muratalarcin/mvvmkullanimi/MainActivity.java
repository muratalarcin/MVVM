package com.muratalarcin.mvvmkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.muratalarcin.mvvmkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        viewModel.sonuc.observe(this, s -> {//Dinleme, gözlemleme (Okuma)
            binding.textViewSonuc.setText(s);
        });



        binding.buttonToplama.setOnClickListener(view -> {
            String alinanSayi1 = binding.editTextSayi1.getText().toString();
            String alinanSayi2 = binding.editTextSayi1.getText().toString();

            viewModel.topla(alinanSayi1, alinanSayi2);
        });

        binding.buttonCarpma.setOnClickListener(view -> {
            String alinanSayi1 = binding.editTextSayi1.getText().toString();
            String alinanSayi2 = binding.editTextSayi1.getText().toString();

            viewModel.carp(alinanSayi1, alinanSayi2);
        });

    }
}