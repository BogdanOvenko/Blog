package com.advantio.repository;

import java.util.List;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
public interface GenericDao<T> {

    T create(T t);
    T read(Class<T> tClass, Long id);
    T update(T t);
    T delete(T t);
    List<T> readAll (Class<T> tClass);
}
