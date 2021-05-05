package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("nhap so tien muon doi vao day (USD)");
        int usd = sc.nextInt();
        System.out.println(usd + " usd = " + usd*rate + " vnd ");
    }
}
