package org.example;

public class PD { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba() {
        int R = in.nextInt(), C = in.nextInt();
        int[][] city = new int[R][C];

        for (int i = 0; i < R; i++) {
            String row = in.next();
            for (int j = 0; j < C; j++) {
                city[i][j] = row.charAt(j) - '0';
            }
        }

        int[][] students = new int[3][2];
        for (int i = 0; i < 3; i++) {
            students[i][0] = in.nextInt() - 1;
            students[i][1] = in.nextInt() - 1;
        }

        int endX = in.nextInt() - 1, endY = in.nextInt() - 1;
        int count = 0;

        for (int[] student : students) {
            if (bfs(city, student[0], student[1], endX, endY)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean bfs(int[][] grid, int startX, int startY, int endX, int endY) {
        int R = grid.length, C = grid[0].length;
        boolean[][] visited = new boolean[R][C];
        java.util.Queue<int[]> queue = new java.util.LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            if (x == endX && y == endY) return true;

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i], newY = y + dy[i];
                if (newX >= 0 && newX < R && newY >= 0 && newY < C && grid[newX][newY] == 0 && !visited[newX][newY]) {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
