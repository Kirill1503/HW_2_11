package com.example.hw_2_11.controller;

import com.example.hw_2_11.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String addAll(@RequestParam("id") List<Integer> values) {
        storeService.addAll(values);
        return Arrays.toString(values.toArray()) + " успешно добавлены в корзину";
    }

    @GetMapping("/get")
    public List<Integer> getAll() {
        return storeService.getAll();
    }
}
