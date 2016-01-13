package com.hsnthn.koding.hashMap;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class HashMapImplementation<K,V> {

    private Entry<K,V>[] bucket;
    static final int DEFAULT_INITIAL_CAPACITY = 4;

    public HashMapImplementation() {
        this.bucket = new Entry[DEFAULT_INITIAL_CAPACITY];
    }

    private int hash(K key){
        return Math.abs(key.hashCode())%DEFAULT_INITIAL_CAPACITY;
    }


    public void put(K key, V value){
        int hash=hash(key);
        Entry<K,V> newEntry=new Entry<K, V>(key,value,null);

        if(bucket[hash]==null){
            bucket[hash]=newEntry;
        }else{
            Entry<K,V> previous=null;
            Entry<K,V> current=bucket[hash];

            //get last entry of linkedlist(Entry)
            while(current!=null){
                if(current.key.equals(key)){
                    if(previous==null){
                        //adding first node to bucket.
                        newEntry.next=current.next;
                        bucket[hash]=newEntry;
                        return;
                    }else{
                        newEntry.next=current.next;
                        previous.next=newEntry;
                        return;
                    }
                }
                previous=current;
                current=current.next;
            }
            previous.next=newEntry;
        }
    }


    public V get(K key){
        int hash=hash(key);
        if(bucket[hash]==null){
            return null;
        }else{
            Entry<K,V> entry= bucket[hash];
            while(entry!=null){
                if(entry.key.equals(key)){
                    return entry.value;
                }
                entry=entry.next;
            }
        }
        return null;
    }


    public boolean remove(K key) {
        int hash=hash(key);
        if(bucket[hash]==null){
            return false;
        }else{
            Entry<K,V> previous=null;
            Entry<K,V> current=bucket[hash];

            while(current!=null){
                if(current.key.equals(key)) {
                    if (previous == null) {
                        //deleting first node from bucket
                        bucket[hash] = bucket[hash].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }
                previous=current;
                current=current.next;
            }
        }
        return false;
    }
}
