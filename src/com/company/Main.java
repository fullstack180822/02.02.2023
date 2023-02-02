package com.company;

public class Main {

     static int z;

    public static int factioral_recursion(int index) {
        int x = index * 2;
        if (index <= 1) {
            return 1;
        }
        int z = 3;
        z = z + 1;
        System.out.println(z);
        return index * factioral_recursion((index - 1));
    }

    public static void main(String[] args) {
        int z = 20;
        int index = 200;
        int x = 100;
        System.out.println(factioral_recursion(5));
    }
}
