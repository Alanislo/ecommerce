package com.store.ecommerce.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String name;
    private String description;
    private String image;
    private double price;
    private int quantity;

}
