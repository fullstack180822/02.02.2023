package com.company;

public class Main {

    public static int add_int(int x, int y) {
        return x + y;
    }

    public static double add_double(double x, double y) {
        return x + y;
    }

    // overloading
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    // cannot overload with ONLY return type difference
    //public static int add(double x, double y) {
    //    return (int)Math.floor(x + y);
    //}

    public static void main(String[] args) {

        System.out.printf("3 + 4 = %d \n", add(3, 4));
        System.out.printf("3.5 + 4.2228 = %f", add(3, 4.2228));
    }


}
