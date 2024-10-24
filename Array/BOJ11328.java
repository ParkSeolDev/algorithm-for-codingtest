package Array;

import java.util.Scanner;

public class BOJ11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++){
            int[] alphabet = new int[26];
            char[] words1 = sc.next().toCharArray();
            char[] words2 = sc.next().toCharArray();
            for (char ch : words1) alphabet[ch-97]++;
            for (char ch : words2) alphabet[ch-97]--;
            boolean flag = true;
            for (int j : alphabet)
                if(j!=0) flag = false;
            System.out.println(flag ? "Possible" : "Impossible");
        }
    }
}
