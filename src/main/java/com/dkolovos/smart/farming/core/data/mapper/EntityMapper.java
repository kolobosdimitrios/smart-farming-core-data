/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dkolovos.smart.farming.core.data.mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dimitrioskolovos
 * Generic interface for mapping between entity (E) and DTO (D) types.
 */
public interface EntityMapper<E,D> {
    /**
     * Convert an entity to its DTO representation.
     * @param entity the entity
     * @return the DTO
     */
    D toDto(E entity);

    /**
     * Convert a DTO to its entity representation.
     * @param dto the DTO
     * @return the entity
     */
    E toEntity(D dto);

    /**
     * Convert a list of entities to a list of DTOs.
     */
    default List<D> toDtoList(List<E> entities) {
        if (entities == null) {
            return Collections.emptyList();
        }
        return entities.stream()
                       .map(this::toDto)
                       .collect(Collectors.toList());
    }

    /**
     * Convert a list of DTOs to a list of entities.
     */
    default List<E> toEntityList(List<D> dtos) {
        if (dtos == null) {
            return Collections.emptyList();
        }
        return dtos.stream()
                   .map(this::toEntity)
                   .collect(Collectors.toList());
    }
}
