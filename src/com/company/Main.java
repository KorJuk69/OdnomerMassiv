package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int massiv[] = new int[n];
        int kolvo = 0;
        int maxkolvo = 0;

        for (int i=0;i<n;i++){

            massiv[i] = scanner.nextInt();

            if(i!=0){
                if(massiv[i]>massiv[i-1]){
                    kolvo++;
                    if (kolvo>maxkolvo) maxkolvo = kolvo;
                }
                else kolvo = 0;
            }
        }

        System.out.print(maxkolvo);

    }
}
