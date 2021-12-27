package com.bootcamp.restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dish {

    private Integer id;
    private Double price;
    private String description;
    private Integer quantity;

}
