package StackQueue;

import java.util.Scanner;
 
public class BOJ2577 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        String product = Integer.toString(a * b * c);
 
        int arr[] = new int[product.length()];
 
        for (int i = 0; i < product.length(); i++) {
            arr[i] = Integer.parseInt(product.substring(i, i+1));
        }
 
        for (int k = 0; k <= 9; k++) {
            int count = 0;
            for (int i = 0; i < product.length(); i++) {
                if (arr[i] == k) {
 
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

