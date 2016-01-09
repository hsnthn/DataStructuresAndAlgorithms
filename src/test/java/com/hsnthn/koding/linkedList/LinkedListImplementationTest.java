package com.hsnthn.koding.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hsnthn on 09.01.2016.
 */
public class LinkedListImplementationTest {

    private static LinkedListImplementation linkedListImplementation;

    @Before
    @Test
    public void testAdd() throws Exception {
        linkedListImplementation=new LinkedListImplementation();
        linkedListImplementation.add(5);
        linkedListImplementation.add(10);
        linkedListImplementation.add(15);
        linkedListImplementation.add(20);
        linkedListImplementation.add(25);
        linkedListImplementation.add(30);
    }

    @Test
    public void testGet() throws Exception {
        Assert.assertEquals(15,linkedListImplementation.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetException(){
        System.out.println(linkedListImplementation.get(100));
    }

    @Test
    public void remove(){
        Assert.assertTrue(linkedListImplementation.remove(4));
    }
}