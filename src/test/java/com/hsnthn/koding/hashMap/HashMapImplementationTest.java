package com.hsnthn.koding.hashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class HashMapImplementationTest<K,V> {

    private HashMapImplementation<Integer,String> hashMapImplementation;

    @Before
    @Test
    public void testPut() throws Exception {
        hashMapImplementation=new HashMapImplementation<Integer,String>();
        hashMapImplementation.put(1,"Hasan");
        hashMapImplementation.put(10,"Mustafa");
        hashMapImplementation.put(13,"Mehmet");

    }


    @Test
    public void testGet(){
        Assert.assertEquals("Mehmet",hashMapImplementation.get(13));
    }

    @Test
    public void testRemove(){
        Assert.assertTrue(hashMapImplementation.remove(1));
    }

}