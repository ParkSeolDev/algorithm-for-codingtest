package Array;

import java.util.Arrays;

class Pro나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                             .filter(n -> n % divisor == 0)
                             .sorted()
                             .toArray();
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        return answer;
    }
}
