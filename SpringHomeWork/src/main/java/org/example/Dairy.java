package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

/**
 * Описание молочных продуктов
 */
@Scope("prototype")
@AllArgsConstructor
@Data
public class Dairy implements Products {
    @Value("${dairy.dairyProductName}")
    private String dairyProductName;
    @Value("${dairy.fatPercentage}")
    private int fatPercentage;

    public Dairy() {
    }
}
