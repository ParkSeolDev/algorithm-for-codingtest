package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ3273 {
    public static int count(int N, int[] arr, int X) {
		int result = 0;
		int sum = 0;
		int left = 0;
		int right = N - 1;
		
		Arrays.sort(arr);
		
		while(left < right) {
			sum = arr[right] + arr[left];
			
			if (sum == X) result++;
			
			if (sum < X) {
				left++;
			} else {
				right--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
		int X = sc.nextInt();
		
		System.out.println(count(N, arr, X));
	}
}
