package com.bootcamp.restaurant.dtos;

import com.bootcamp.restaurant.entities.Order;

public class OrderDTO implements Dto<Order, OrderDTO>{

    @Override
    public Order convert() {
        return null;
    }

    @Override
    public OrderDTO convertToDTO(Order order) {
        return null;
    }
}
