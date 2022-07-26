package com.company.List;

public class Main3 {
    public static void main(String[] args) {
        int n=13;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >=0 ; j--) {
                System.out.print((char) (j+65));
            }
            System.out.println();
        }

    }
}
