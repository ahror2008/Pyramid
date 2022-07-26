package com.company.List;

public class Main4 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1||i==1||i==n||(i>n/2&&j==n)||(i==(n/2+1)&&j>n/2)){
                    System.out.print("G ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


