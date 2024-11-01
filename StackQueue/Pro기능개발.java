package StackQueue;

import java.util.*;

class Pro기능개발 {
    static final double MAX_PROGRESS = 100;
    
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            double remainProgress = MAX_PROGRESS - progresses[i];
            int remainDay = (int) Math.ceil(remainProgress / speeds[i]);
            queue.add(remainDay);
        }

        List<Integer> answers = new ArrayList<>();
        int day = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            if (day < queue.peek()) {
                answers.add(count);
                count = 1;
                day = queue.poll();
            } else {
                count++;
                queue.poll();
            }
        }
        answers.add(count);

        int[] answer = answers.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.stream(answer)
                .forEach(System.out::println);
        
        return answer;
    }
}