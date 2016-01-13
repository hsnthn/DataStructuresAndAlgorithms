package com.hsnthn.koding.hashSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hsnthn on 14.01.2016.
 */
public class HashSetImplementationTest {

    private HashSetImplementation hashSetImplementation;

    @Before
    @Test
    public void testAdd(){
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(5);
        hashSetImplementation.add(15);
        hashSetImplementation.add(25);
        hashSetImplementation.add(35);
    }

    @Test
    public void testRemove(){
        hashSetImplementation.remove(5);
    }

    @Test
    public void testContains(){
        Assert.assertTrue(hashSetImplementation.contains(15));
    }

}