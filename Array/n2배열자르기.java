package Array;

class n2배열자르기 {
    public int[] solution(int n, long left, long right) {
        
        int[] answer = new int[(int)(right - left + 1)];
        long m = 0; // 몫
        long k = 0; // 나머지
        int idx = 0;
        
        for(long i = left; i <= right; i++){
            m = i / n;
            k = i % n;
            answer[idx] = (int)Math.max(m+1, k+1);
            idx++;
        }
        
        return answer;
    }
}
