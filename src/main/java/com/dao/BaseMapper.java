package com.dao;

public interface BaseMapper<T, P> {
    T getById(P id);
    
    T getByEntity(T entity);

    int update(T entity);

    int deleteByPrimaryKey(P id);

    int insert(T entity);
}
