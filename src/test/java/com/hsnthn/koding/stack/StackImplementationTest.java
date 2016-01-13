package com.hsnthn.koding.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class StackImplementationTest {

    private StackImplementation stackImplementation;

    @Before
    @Test
    public void testPush(){
        stackImplementation=new StackImplementation();
        stackImplementation.push(5);
        stackImplementation.push(15);
        stackImplementation.push(8);
        stackImplementation.push(200);
        stackImplementation.push(13);
        stackImplementation.push(17);
        stackImplementation.push(3);
    }

    @Test
    public void testPop(){
        Assert.assertEquals(3,stackImplementation.pop());
    }

    @Test
    public void testEmpty(){
        Assert.assertFalse(stackImplementation.empty());
    }

    @Test
    public void testPeek(){
        Assert.assertEquals(3,stackImplementation.peek());
    }

}