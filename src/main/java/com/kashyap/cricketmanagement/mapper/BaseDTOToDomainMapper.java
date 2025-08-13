package com.kashyap.cricketmanagement.mapper;

public abstract class BaseDTOToDomainMapper<E, D> implements BaseMapper<D, E> {

    public D toDto(E entity) {
        return null;
    }

    public D toDto(E entity, Class<D> dtoClass){
        return null;
    };

    public E toEntity(D dto, Class<E> entityClass){
        return null;
    };
}
