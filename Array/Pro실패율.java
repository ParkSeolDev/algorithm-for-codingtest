package Array;

import java.util.*;

class Pro실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Arrays.sort(stages);
        
        double[][] fail = new double[N + 1][2];
        for (int i = 1; i <= N; i++) {
            fail[i][0] = i;
        }
        
        int remains = stages.length;
        
        for (int i = 1; i <= N; i++) {
            int count = 0;
            
            while (remains > 0 && stages[stages.length - remains] == i) {
                count++;
                remains--;
            }
            
            if (remains + count > 0) {
                fail[i][1] = (double) count / (remains + count);
            } else {
                fail[i][1] = 0;
            }
        }

        Arrays.sort(fail, 1, N + 1, (a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < N; i++) {
            answer[i] = (int) fail[i + 1][0];
        }

        return answer;
    }
}
