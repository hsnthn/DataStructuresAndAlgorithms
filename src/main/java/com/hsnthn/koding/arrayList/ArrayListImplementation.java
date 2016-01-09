package com.hsnthn.koding.arrayList;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by hsnthn on 07.01.2016.
 */
public class ArrayListImplementation<E> {

    private Object[] dataStore;

    public ArrayListImplementation(){
        this.dataStore=new Object[0];
    }

    public ArrayListImplementation(int size){
        this.dataStore=new Object[size];
    }

    public ArrayListImplementation(Collection<? extends E> collection){
        this.dataStore= collection.toArray();
    }

    E dataStore(int index){
        return (E) dataStore[index];
    }

    public E get(int index){
        checkSize(index);
        return dataStore(index);
    }

    public boolean add(Object newValue){
        resizeArrayList();
        dataStore[dataStore.length-1]=newValue;
        return true;
    }

    public boolean remove(int index){
        checkSize(index);
        E deleteValue=dataStore(index);
        System.arraycopy(dataStore, index+1, dataStore, index, dataStore.length-index-1);
        dataStore[dataStore.length-1]=null;
        return true;
    }

    private void resizeArrayList() {
        dataStore=Arrays.copyOf(dataStore, dataStore.length+1);
    }

    private void checkSize(int index) {
        if(index<0 ||index>dataStore.length){
            throw  new IndexOutOfBoundsException();
        }
    }
}
