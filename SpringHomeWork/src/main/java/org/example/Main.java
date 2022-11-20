package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Fridge fridge = context.getBean("fridgeBean", Fridge.class);
        Herbal herbal1 = context.getBean("herbalBean", Herbal.class);
        Herbal herbal2 = context.getBean("herbalBean", Herbal.class);
        Dairy dairy1 = context.getBean("dairyBean", Dairy.class);
        Dairy dairy2 = context.getBean("dairyBean", Dairy.class);
        fridge.setProductsList(herbal1);
        fridge.setProductsList(herbal2);
        fridge.setProductsList(dairy1);
        fridge.setProductsList(dairy2);
        fridge.PrintProductsList();

    }
}
