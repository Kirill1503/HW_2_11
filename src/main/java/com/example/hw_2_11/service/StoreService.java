package com.example.hw_2_11.service;

import com.example.hw_2_11.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void addAll(List<Integer> values) {
        basket.addAll(values);
    }

    public List<Integer> getAll (){
        return basket.getAll();
    }
}
