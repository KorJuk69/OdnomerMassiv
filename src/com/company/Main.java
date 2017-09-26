package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int massiv[];
        massiv = new int[n];

        for (int i=0;i<n;i++){
            massiv[i] = scanner.nextInt();
        }

        for (int i=0;i<n;i+=2){
            System.out.print(massiv[i] + " ");
        }
    }
}
