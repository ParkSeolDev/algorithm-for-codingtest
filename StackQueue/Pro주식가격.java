package StackQueue;

import java.util.*;

public class Pro주식가격 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                answer[stack.peek()] = i - stack.pop();
            }

            stack.push(i);
        }

        for (int time : stack) {
            answer[time] = n - 1 - time;
        }

        return answer;
    }
}
