package com.example.hw_2_11.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Basket {
    private List<Integer> basket = new ArrayList<>();

    public void addAll(List<Integer> values) {
        basket.addAll(values);
    }


    public List<Integer> getAll() {
        return basket;
    }

}
