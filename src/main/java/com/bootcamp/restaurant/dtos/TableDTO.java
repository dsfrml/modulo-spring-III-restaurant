package com.bootcamp.restaurant.dtos;

import com.bootcamp.restaurant.entities.Table;

public class TableDTO implements Dto<Table, TableDTO> {
    @Override
    public Table convert() {
        return null;
    }

    @Override
    public TableDTO convertToDTO(Table table) {
        return null;
    }
}
