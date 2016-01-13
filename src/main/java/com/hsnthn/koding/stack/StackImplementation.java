package com.hsnthn.koding.stack;


import com.hsnthn.koding.util.Node;

/**
 * Created by hsnthn on 11.01.2016.
 */
public class StackImplementation<E>{

    private static Node node;

    public Object peek(){
        return node.getValue();
    }

    public void push(Object value){
        Node newNode=new Node(value);
        newNode.setNextNode(node);
        node=newNode;
    }

    public Object pop(){
        if(node!=null){
            Object item=node.getValue();
            node=node.getNextNode();
            return item;
        }
        return null;
    }

    public boolean empty(){
        if(node!=null){
            return false;
        }else{
            return true;
        }
    }

}
