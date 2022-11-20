package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Описание холодильника
 */
@Data
public class Fridge {
    /**
     * Модель холодильника
     */
    @Value("${fridge.model}")
    private String model;
    private List<Products> productsList = new ArrayList<>();

    public void setProductsList(Products products) {
        productsList.add(products);
    }

    public void PrintProductsList() {
        System.out.println(model + productsList);
    }

}

