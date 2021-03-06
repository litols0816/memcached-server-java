package com.leafgraph.memcachedserv.infra.dao;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Created by takahiro on 2016/11/07.
 */
public abstract class Dao {
    public abstract boolean write(String key, String value);
    public abstract String read(String key);
    public abstract boolean delete(String key);
    public abstract boolean containsKey(String key);

    public abstract int countItems();

    public abstract Set<Map.Entry<String,String>> getDurtySet();
    public abstract void deleteDurtySet(String key, String value);
}
