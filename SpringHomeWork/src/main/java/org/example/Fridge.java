package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Описание холодильника
 */
@Data
public class Fridge {
    @Value("${fridge.model}")
    private String model;
    @Autowired
    public List<Products> productsList = new ArrayList<>();

}

