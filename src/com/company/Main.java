package com.company;

public class Main {

    public static void main(String[] args) {

        int n=5;
        int mid=n/2+1;
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1||i==n||i==mid||j==1||j==n){
                    System.out.print("8 ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
