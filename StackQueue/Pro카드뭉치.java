package StackQueue;

import java.util.Queue;
import java.util.LinkedList;

public class Pro카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> goalQ = new LinkedList<String>();
        Queue<String> cards1Q = new LinkedList<String>();
        Queue<String> cards2Q = new LinkedList<String>();

        for(String s1 : goal) goalQ.offer(s1);
        for(String s2 : cards1) cards1Q.offer(s2);
        for(String s3 : cards2) cards2Q.offer(s3);

        while(goalQ.size() > 0) {
            String tmp = goalQ.poll();
            if(tmp.equals(cards1Q.peek())) cards1Q.poll();    
            else if(tmp.equals(cards2Q.peek())) cards2Q.poll();
            else return "No";
        }
        return "Yes";
    }
}
