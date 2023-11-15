package com.muratalarcin.mvvmkullanimi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public MutableLiveData<String> sonuc;
    public MatematikRepository mrepo = new MatematikRepository();
    public MainActivityViewModel() {
        sonuc = mrepo.sonuc;
    }

    public void topla(String alinanSayi1, String alinanSayi2) {
        mrepo.topla(alinanSayi1, alinanSayi2);
    }
    public void carp(String alinanSayi1, String alinanSayi2) {
        mrepo.carp(alinanSayi1, alinanSayi2);
    }

}
