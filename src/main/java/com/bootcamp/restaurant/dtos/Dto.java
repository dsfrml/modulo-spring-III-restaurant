package com.bootcamp.restaurant.dtos;

public interface Dto<T, D> {
    T convert();
    D convertToDTO(T t);
}
