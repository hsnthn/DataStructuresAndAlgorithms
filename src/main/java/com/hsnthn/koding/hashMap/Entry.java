package com.hsnthn.koding.hashMap;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class Entry<K,V> {

    K key;
    V value;
    Entry<K,V> next;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
