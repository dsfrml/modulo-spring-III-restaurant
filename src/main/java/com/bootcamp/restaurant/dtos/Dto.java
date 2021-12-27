package com.bootcamp.restaurant.dtos;

public interface Dto<T, D> {
    T convertToEntity(D d);
    D convertToDTO(T t);
}
