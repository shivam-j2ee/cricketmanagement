package com.kashyap.cricketmanagement.mapper;

public abstract class BaseDomainToDTOMapper<D, E> implements BaseMapper<D, E>{


    public  E toEntity(D dto){
        return null;
    };

    public D toDto(E entity, Class<D> dtoClass){
        return null;
    };

    public E toEntity(D dto, Class<E> entityClass){
        return null;
    };
}