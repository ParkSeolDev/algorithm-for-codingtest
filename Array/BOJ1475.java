package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        char[] chars = N.toCharArray();

        int[] countArr = new int[10];

        for(char c : chars) {
            int num = c - '0';
            if(num == 9) {
                num = 6;
            }
            countArr[num]++;
        }
        
        countArr[6] = countArr[6]/2 + countArr[6]%2;
		
        Arrays.sort(countArr);
        System.out.println(countArr[9]);
    }
}
