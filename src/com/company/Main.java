package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class Main {

    public static long fibb(int index) {
        if (index == 1) {
            return 0;
        }
        if (index == 2) {
            return 1;
        }

        long a = 0;
        long b = 1;
        for (int i = 2; i < index; i++) {
            long c = b; // 13
            b = a + b; // 21
            a = c; // 13
        }

        return b;
    }

    // 5! = 1 * 2 * 3 * 4 * 5
    // 1! = 1
    // 0! = 1

    public int factioral_recursion(int index) {
        if (index <= 1) {
            return 1;
        }
        return index * factioral_recursion((index - 1));
    }


    public static int fibb_recursion(int index) {
        if (index == 1) {
            return 0;
        }
        if (index == 2) {
            return 1;
        }

        return fibb_recursion(index - 1) + fibb_recursion(index - 2);
    }


    public static int sum_pos_rec(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sum_pos_rec(a + 1, b - 1);
    }
    // 8 , 4 --> 9, 3 --> 10, 2 --> 11, 1 --> 12, 0

    public static void printAllFilesAndFolders(String space, String path) {
        System.out.println("=====================" + path + "=======================");
        File f = new File(path);
        for (File f1: f.listFiles()) {
            System.out.println(space + f1.getName() + " " + (f1.isDirectory() ? "[D]" : ""));
        }
        for (File f1: f.listFiles()) {
            if (f1.isDirectory()) {
                printAllFilesAndFolders(space + "    " , f1.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 81; i++) {
            System.out.format("[%d] %d ", i, fibb(i));
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.format("[%d] %d ", i, fibb_recursion(i));
        }
            System.out.println();

            System.out.println(fibb_recursion(10));
        // 1 2 3 4 5 6 7  8  9 ...
        // 0 1 1 2 3 5 8 13 21 ...
        // a b
        //   a b
        //     a b

        printAllFilesAndFolders("","c:\\temp");
    }
}
