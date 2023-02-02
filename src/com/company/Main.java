package com.company;

public class Main {

    public static void main(String[] args) {

        String fname = "Yaniv";
        String lname = "Cohen";

        String full_name = String.format("{%s}.{%s}", fname, lname);

        String sentence = String.format("Welcome to the course: your first name is {%s} and your last name is: {%s}", fname, lname);

        System.out.printf(sentence);

        int index_of_lname = sentence.indexOf(lname);

    }
}
