package com.hsnthn.koding.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class QueueImplementationTest {

    private QueueImplementation queueImplementation;

    @Before
    @Test
    public void testEnqueue(){
        queueImplementation=new QueueImplementation();
        queueImplementation.enqueue(5);
        queueImplementation.enqueue(45);
        queueImplementation.enqueue(4);
        queueImplementation.enqueue(0);
        queueImplementation.enqueue(35);
    }

    @Test
    public void testDequeue(){
        Assert.assertEquals(5,queueImplementation.dequeue());
    }

    @Test
    public void testDequeue2(){
        System.out.println(queueImplementation.dequeue().toString() + queueImplementation.dequeue().toString() + queueImplementation.dequeue().toString());
    }

}