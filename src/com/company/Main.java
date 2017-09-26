package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int massiv[];
        massiv = new int[n];
        int chet = 0;

        for(int i=0;i<n;i++){

            massiv[i] = scanner.nextInt();
            if (massiv[i]>0) chet++;

        }

        System.out.print(chet);

    }
}
