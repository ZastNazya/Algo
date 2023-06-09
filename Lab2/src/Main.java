public class Main {
    public static void main(String[] args) {
        int[][] islandGrid = {
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 1, 0, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 1, 0, 0, 1, 1, 1, 1},
                {0, 0, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        System.out.println("Number of islands: " + NumIsland.countIslands(islandGrid));
    }
}