package com.example.sanjar_shop.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sanjar_shop.models.CMODEL;
import com.example.sanjar_shop.models.ModelM;
import com.example.sanjar_shop.repositories.JemRepository;

import java.util.List;

public class HomeViewModel extends ViewModel {
    private JemRepository jemRepository;

    private  LiveData<List<ModelM>> modelMResponseLiveData;
    public HomeViewModel() {
        jemRepository = new JemRepository();
        modelMResponseLiveData = jemRepository.getDashJeminyList();
    }

    public LiveData<List<ModelM>> getModeResponseLiveData() {
        return modelMResponseLiveData;
    }

}