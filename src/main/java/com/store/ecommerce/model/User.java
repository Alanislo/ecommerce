package com.store.ecommerce.model;

import lombok.*;

import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String address;
    private String phone;
    private String type;
    private String password;
}
