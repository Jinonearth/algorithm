package com.algorithm.bfs;

public class Main {


    import java.util.*;

    class Solution {
        public int solution(int n, int[][] computers) {
            //0. visited 저장배열 생성
            int[] visited = new int[n];
            for (int i=0; i<n; i++){
                visited[i] = -1;
            }
            int network = 0;
            //4. 모든 컴퓨터에 대해서 dfs 시행
            for (int i=0; i<n; i++){
                if (visited[i] == -1){
                    network += dfs(i, n, computers, visited);
                }
            }
            return network;
        }

        public int dfs(int n, int l, int[][] computers, int[] visited){
            // 1. 방문한 경우 0을 반환
            if (visited[n] != -1){
                return 0;
            }
            // 2. 방문한 경우 대입할 값을 넣어줌
            visited[n] = 1;

            // 3. 링크값으로 dfs 재귀
            for (int i=0; i<l; i++){
                if (computers[n][i] == 1){
                    dfs(i, l, computers, visited);
                }
            }
            return 1;
        }
    }
}
