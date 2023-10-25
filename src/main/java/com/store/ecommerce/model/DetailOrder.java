package com.store.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailOrder {
    private Integer id;
    private String name;
    private double price;
    private double total;
}
