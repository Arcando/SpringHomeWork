package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

/**
 * Описание растительных продуктов
 */
@Scope("prototype")
@AllArgsConstructor
@Data
public class Herbal implements Products {
    @Value("${herbal.herbalProductName}")
    private String herbalProductName;

    public Herbal() {
    }
}