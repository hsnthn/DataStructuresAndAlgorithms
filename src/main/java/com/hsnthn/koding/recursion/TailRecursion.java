package com.hsnthn.koding.recursion;

import java.util.HashMap;

/**
 * Created by hsnthn on 12.01.2016.
 */
public class TailRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
        System.out.println(factorialTailRecursion(5));
    }

    private static int factorial(int n){
        int result=1;
        for(int i=1; i<=n;i++){
            result=result*i;
        }
        return result;
    }

    private static int factorialRecursive(int n){
        if(n==0){
            return 1;
        }
        return n*factorialRecursive(n-1);
    }

    private static int fact(int n, int k) {
        if (n == 0) return k;
        else return fact(n - 1, n * k);
    }

    public static int factorialTailRecursion(int n) {
        return fact(n, 1);
    }


}
