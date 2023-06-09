import java.util.LinkedList;
import java.util.Queue;

public class NumIsland
{
    static final int ROWS = 10;
    static final int COLUMNS = 10;

    static boolean isUnmarkedLand(int[][] islandsGrid, int i, int j, boolean[][] visited) {
        return (i >= 0 && i < ROWS && j >= 0 && j < COLUMNS && islandsGrid[i][j] == 1 && !visited[i][j]);
    }

    static void BFS(int[][] islandsGRID, boolean[][] visited, int i, int j) {
        int[] rowNumbers = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNumbers = {-1, 0, 1, -1, 1, -1, 0, 1};

        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(i, j));
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int rowAdjacent = queue.peek().first;
            int colAdjacent = queue.peek().second;
            queue.remove();

            for (int k = 0; k < 8; k++) {
                if (isUnmarkedLand(islandsGRID, rowAdjacent + rowNumbers[k], colAdjacent + colNumbers[k], visited)) {
                    visited[rowAdjacent + rowNumbers[k]][colAdjacent + colNumbers[k]] = true;
                    queue.add(new pair(rowAdjacent + rowNumbers[k], colAdjacent + colNumbers[k]));
                }
            }

        }
    }

    static class pair {
        int first, second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static int countIslands(int[][] islandsGrid) {
        boolean[][] visited = new boolean[ROWS][COLUMNS];

        int numberOfIslands = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (islandsGrid[i][j] == 1 && !visited[i][j]) {
                    BFS(islandsGrid, visited, i, j);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }
}

