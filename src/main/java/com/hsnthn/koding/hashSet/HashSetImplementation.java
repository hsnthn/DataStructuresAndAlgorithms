package com.hsnthn.koding.hashSet;

import java.util.HashMap;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class HashSetImplementation<K> {

    private HashMap map;

    public HashSetImplementation() {
        this.map = new HashMap();
    }

    public boolean add(K key){
        this.map.put(key,new Object());
        return true;
    }

    public boolean remove(K key){
        this.map.remove(key);
        return true;
    }

    public boolean contains(K key){
        this.map.containsKey(key);
        return false;
    }


}
