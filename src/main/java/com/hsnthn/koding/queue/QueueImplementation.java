package com.hsnthn.koding.queue;

import com.hsnthn.koding.util.Node;

import java.util.NoSuchElementException;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class QueueImplementation<E> {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public QueueImplementation<E> enqueue(E value){
        Node current=lastNode;
        lastNode=new Node(value);

        if(size++ == 0){
            firstNode=lastNode;
        }else{
            current.setNextNode(lastNode);
        }

        return this;
    }


    public E dequeue(){
        if(size==0){
            throw  new NoSuchElementException();
        }
        Object value=firstNode.getValue();
        firstNode=firstNode.getNextNode();
        if(--size==0){
            lastNode=null;
        }
        return (E) value;
    }


}
