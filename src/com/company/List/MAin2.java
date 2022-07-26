package com.company.List;

public class MAin2 {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1||i==1||i==n/2+1){
                    System.out.print("F ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
