package com.cjmiller85;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNum = 100;
        for ( int i = 1; i <= maxNum; i++ ) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
