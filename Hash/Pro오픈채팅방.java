package Hash;

import java.util.*;

public class Pro오픈채팅방 {
    public String[] solution(String[] record) {
        Map<String, String> ID = new HashMap<>();
        List<String[]> result = new LinkedList<>();
 
        for (String records : record) {
            String[] temp = records.split(" ");
            
            if (temp[0].equals("Enter")) { 
                ID.put(temp[1], temp[2]);
                result.add(temp);
                
            } else if (temp[0].equals("Change")) {
                ID.replace(temp[1], temp[2]);
               
            } else {
                result.add(temp);
            }
        }
    
        String[] answer = new String[result.size()];
        int idx = 0;
        for (String[] keyWords : result){
            String nickName = ID.get(keyWords[1]);
            
            if (keyWords[0].equals("Enter")) { 
                answer[idx++] = nickName + "님이 들어왔습니다.";
            } else {
                answer[idx++] = nickName + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}