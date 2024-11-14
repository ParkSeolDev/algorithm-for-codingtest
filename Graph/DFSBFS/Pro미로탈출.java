package Graph.DFSBFS;

import java.util.*;

class Pro미로탈출 {
    private int N, M;
    private int sx, sy, lx, ly, ex, ey;
    private int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private boolean[][] visit;

    public void init(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (maps[i].charAt(j) == 'S') {
                    sx = i;
                    sy = j;
                }
                if (maps[i].charAt(j) == 'L') {
                    lx = i;
                    ly = j;
                }
                if (maps[i].charAt(j) == 'E') {
                    ex = i;
                    ey = j;
                }
            }
        }
        
        visit = new boolean[N][M];
    }

    public int solution(String[] maps) {
        init(maps);

        int[] s = {sx, sy};
        int[] l = {lx, ly};
        int[] e = {ex, ey};

        int stol = bfs(maps, s, l);
        if (stol == -1) return -1;

        for (boolean[] v : visit) {
            Arrays.fill(v, false);
        }

        int ltoe = bfs(maps, l, e);
        if (ltoe == -1) return -1;

        return stol + ltoe;
    }

    public int bfs(String[] maps, int[] start, int[] end) {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[]{start[0], start[1], 0});

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == end[0] && y == end[1]) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if (nx >= N || nx < 0 || ny >= M || ny < 0) continue;
                if (maps[nx].charAt(ny) == 'X') continue;
                if (visit[nx][ny]) continue;

                visit[nx][ny] = true;
                dq.offer(new int[]{nx, ny, dist + 1});
            }
        }

        return -1;
    }
}