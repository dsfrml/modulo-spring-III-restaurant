package com.bootcamp.restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Table {
    private Integer id;
    private Double totalValueConsumed;
    private List<Order> orders ;
}
