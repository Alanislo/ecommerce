package com.store.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
// el toString se crea por el data
public class Order {
    private Integer id;
    private String number;
    private LocalDateTime creationDate;
    private LocalDateTime receptionDate;
    private double amount;
}
