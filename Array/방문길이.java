package Array;

import java.util.ArrayList;

class 방문길이 {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        ArrayList<String> visit = new ArrayList<String>();
        
        for (int i = 0; i < dirs.length(); i++) {
            int preX = x;
            int preY = y;
            char s = dirs.charAt(i);
            
            if (s == 'U' && y < 5)
                y++;
            else if (s == 'D' && y > -5)
                y--;
            else if (s == 'R' && x < 5)
                x++;
            else if (s == 'L' && x > -5)
                x--;

            String xy = Integer.toString(x);
            xy += Integer.toString(y);
            String preXY = Integer.toString(preX);
            preXY += Integer.toString(preY);
            String path = xy + preXY;
            String reversePath = preXY + xy;
            
            if (!visit.contains(path) && !visit.contains(reversePath) && !path.equals(reversePath)) {
                visit.add(path);
                visit.add(reversePath);
            }
        }
        
        answer = visit.size() / 2;
        return answer;
    }
}
