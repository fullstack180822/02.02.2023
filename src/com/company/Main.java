package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void foo() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void goo() throws FileNotFoundException {
        File f = new File("c:/temp/111111111111111111111.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
    }

    public static void moo() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) throws ClassNotFoundException {

        moo();

	    foo();

        try {
            goo();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
