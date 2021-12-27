package com.bootcamp.restaurant.dtos;

import com.bootcamp.restaurant.entities.Dish;

public class DishDTO implements Dto<Dish, DishDTO>{

    @Override
    public Dish convert() {
        return null;
    }

    @Override
    public DishDTO convertToDTO(Dish dish) {
        return null;
    }
}
