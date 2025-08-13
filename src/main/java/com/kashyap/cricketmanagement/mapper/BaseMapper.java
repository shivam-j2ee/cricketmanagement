package com.kashyap.cricketmanagement.mapper;
//to implement in every mapper class that converts between DTOs and Entities
public interface BaseMapper<D, E> {

     D toDto(E entity);

     E toEntity(D dto);

     D toDto(E entity, Class<D> dtoClass);

     E toEntity(D dto, Class<E> entityClass);
}
