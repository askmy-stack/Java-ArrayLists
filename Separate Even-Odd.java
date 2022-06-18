package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Set Number to form a Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Arrays:");
            a[i] = sc.nextInt();
        }
        getEvenOdd(a);
    }
    private static void getEvenOdd(int[] a) {
        ArrayList<Integer>even = new ArrayList<Integer>();
        ArrayList<Integer>odd = new ArrayList<Integer>();
        for (int i = 0; i <a.length; i++) {
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            } else {
                odd.add(a[i]);
            }
        }
            for (int i = 0; i < odd.size(); i++) {
                System.out.println("The Odd Array List:" +odd.get(i));
            }
            for (int i = 0; i < even.size(); i++) {
                System.out.println("The Even Array List:" +even.get(i));
            }
    }
}
