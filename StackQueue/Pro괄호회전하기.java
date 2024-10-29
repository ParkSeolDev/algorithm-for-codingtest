package StackQueue;

import java.util.*;

public class Pro괄호회전하기 {
    public int solution(String s) {
        ArrayList<Character> sList = new ArrayList<>();
        for(int k = 0; k < s.length(); k++){
            sList.add(s.charAt(k));
        }

        int result = 0;
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i = 0; i < sList.size(); i++){
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < sList.size(); j++){
                if(stack.isEmpty()){
                    stack.push(sList.get(j));
                }else if(stack.peek() == map.get(sList.get(j))){
                    stack.pop();
                }else{
                    stack.push(sList.get(j));
                }
            }
            if(stack.size() == 0)result++;
            char temp = sList.get(0);
            sList.remove(0);
            sList.add(temp);
        }
        return result;
    }
}
