package com.company;

public class Main {
    static void myMethod() {
        System.out.println("I am excited");
    }

    static void myMethod(String name) {
        System.out.println(name);
    }

    static void myMethod(String fname, String lname) {
        System.out.println(fname + " " + lname);
    }

    static void myMethod(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        /*
        System.out.println("Hello World");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6 || arr[i] == 7) {
                continue;
            } else if (arr[i] == 9) {
                break;
            } else {
                sum += arr[i];
            }
        }

        int avg = sum / arr.length;
        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + avg);
        */

        myMethod();
        myMethod("Lamia");
        myMethod(10, 20);
    }
}
