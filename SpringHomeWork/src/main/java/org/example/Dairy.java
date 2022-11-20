package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

/**
 * Описание молочных продуктов
 */
@Scope("singleton")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dairy implements Products {
    /**
     * Название продукта
     */
    @Value("${dairy.dairyProductName}")
    private String dairyProductName;

    /**
     * Жирность продукта
     */
    @Value("${dairy.fatPercentage}")
    private int fatPercentage;
}
