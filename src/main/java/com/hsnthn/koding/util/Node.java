package com.hsnthn.koding.util;

/**
 * Created by hsnthn on 08.01.2016.
 */
public class Node<E> {
    private E value;
    private Node nextNode;

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
