package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        System.out.println("Challange 1:");
        var fizzBuzz = new FizzBuzz(number);
        fizzBuzz.codeChallange1(number);

    }
}
