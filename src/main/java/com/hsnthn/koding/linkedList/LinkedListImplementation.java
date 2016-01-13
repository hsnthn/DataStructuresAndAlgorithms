package com.hsnthn.koding.linkedList;

import com.hsnthn.koding.util.Node;

/**
 * Created by hsnthn on 08.01.2016.
 */
public class LinkedListImplementation<E> {

    private Node head;

    public void add(E value){
        Node node=new Node(value);
        if(head==null){
            head=node;
        }else{
            Node nextNode=head;
            while(nextNode.getNextNode()!=null){
                nextNode=nextNode.getNextNode();
            }
            nextNode.setNextNode(node);
        }
    }

    public E get(int index){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }
        return node(index);
    }

    E node(int index){
        Node searchedNode = head;
        for(int i=0; i<index;i++){
            if(searchedNode.getNextNode() != null){
                searchedNode=searchedNode.getNextNode();
            }else{
                throw new IndexOutOfBoundsException();
            }
        }
        return (E) searchedNode.getValue();
    }

    //removeFirst
    public boolean remove(){
        this.head=head.getNextNode();
        return true;
    }

    public boolean remove(int index){
        Node removedNode=head;
        if(index==0){
            remove();
        }
        for(int i=0;i<index;i++){
            if(removedNode.getNextNode() != null){
                if(i+1==index){
                    removedNode.setNextNode(removedNode.getNextNode().getNextNode());
                    break;
                }else {
                    removedNode=removedNode.getNextNode();
                }
            }else{
                throw new IndexOutOfBoundsException();
            }
        }
        return false;
    }


}
