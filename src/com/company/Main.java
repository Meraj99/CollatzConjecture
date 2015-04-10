package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number to get its Collatz Conjecture.");
        long num = Long.parseLong(reader.readLine());

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num = (num * 3) + 1;
            }
            System.out.println(num);
        }
    }
}
