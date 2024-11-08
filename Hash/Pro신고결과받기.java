package Hash;

import java.util.*;

class Pro신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
      		int[] answer = new int[id_list.length];
	        ArrayList<String> list = new ArrayList<>();

	        Map<String, Integer> rpmap = new HashMap<>(); 
	        Arrays.stream(report).distinct().forEach((rp) -> {
	        	String rplist[] = rp.split(" ");
	        	int cnt = 1;
	        	if(rpmap.containsKey(rplist[1]))
	        		cnt = rpmap.get(rplist[1])+1;
	        	rpmap.put(rplist[1],cnt);
	        	list.add(rp);
	        }); 
	          
	        for(String li:list) {
	        	String[] liArr = li.split(" ");
	        	 
	        	if(rpmap.get(liArr[1]) >= k)
	        		answer[Arrays.asList(id_list).indexOf(liArr[0])]++;
	        } 	        
	        return answer;
    }
}
