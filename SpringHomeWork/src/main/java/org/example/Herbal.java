package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

/**
 * Описание растительных продуктов
 */
@Scope("prototype")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Herbal implements Products {
    /**
     * Название продукта
     */
    @Value("${herbal.herbalProductName}")
    private String herbalProductName;
}