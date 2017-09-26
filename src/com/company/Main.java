package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int massiv[] = new int[n];


        for (int i=0;i<n;i++){
            massiv[i] = scanner.nextInt();
        }

        for (int i=0;i<n;i++){
            if (i!=0){
                if((massiv[i]>0)&&(massiv[i-1]>0)) {
                    System.out.print("Yes");
                    break;
                }
                else if ((massiv[i]<0)&&(massiv[i-1]<0)) {
                    System.out.print("Yes");
                    break;
                }
                else {
                    System.out.print("NO");
                    break;
                }
            }
        }
    }
}
