package com.taoria.lib.init;


/**
 * Created by Administrator on 2016/11/28.
 */
public interface ObjectManager<T> {
    public T getObject(String key);
    public Class<?> getObjectType(String key);
    public T registerObject(String key, Class<?> type) ;
}
