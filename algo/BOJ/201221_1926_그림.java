package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * BOJ_1926_201220
 */
public class BOJ_1926_그림 {
    static int map[][];
    static boolean visited[][];
    static int row, col, cnt = 1, group, max;
    static int dx[] = { 0, 0, 1, -1 };
    static int dy[] = { -1, 1, 0, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        map = new int[row][col];
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                if (!visited[x][y] && map[x][y] == 1) {
                    bfs(x, y);
                    max = Math.max(max, cnt);
                }
            }
        }

        System.out.println(group);
        if (max == 0) {
            System.out.println(0);
        } else if (max == 1) {
            System.out.println(max);
        } else {
            System.out.println(max - 1);
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<int[]>();
        int cur[] = new int[2];
        // visited[x][y] = true;
        q.offer(new int[] { x, y });
        int nx = 0, ny = 0;
        cnt = 1;
        group++;

        while (!q.isEmpty()) {
            cur = q.poll();
            for (int k = 0; k < 4; k++) {
                nx = cur[0] + dx[k];
                ny = cur[1] + dy[k];

                if (nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.offer(new int[] { nx, ny });
                    map[nx][ny] = cnt++;

                }
            }
        }
    }
}