package Hash;

import java.util.HashMap;

class Pro완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> partMap = new HashMap<>();
        
        for (String p : participant) {
            partMap.put(p, partMap.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            partMap.put(c, partMap.get(c) - 1);
        }
        
        for (String key : partMap.keySet()) {
            if (partMap.get(key) != 0) {
                return key;
            }
        }
        
        return "";
    }
}
