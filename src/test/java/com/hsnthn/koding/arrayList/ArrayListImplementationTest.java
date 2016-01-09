package com.hsnthn.koding.arrayList;

/**
 * Created by hsnthn on 08.01.2016.
 */
public class ArrayListImplementationTest {

    public static ArrayListImplementation arrayListImplementation;

    @org.junit.Test
    public void testAdd() throws Exception {
        arrayListImplementation=new ArrayListImplementation();
        arrayListImplementation.add("hsnthn");
        arrayListImplementation.add("Burcu");
        arrayListImplementation.add("littleHsnthns");
        arrayListImplementation.add("littleBurcus");
    }

    @org.junit.Test
    public void testGet() throws Exception {
        System.out.println("get(0) :"+arrayListImplementation.get(0));
    }



    @org.junit.Test
    public void testRemove() throws Exception {
        if(arrayListImplementation.remove(0)){
            System.out.println("remove succeded");
        }
    }
}