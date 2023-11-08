package MazeModernized;

public class Maze {

    private int[][] maze;

    public Maze(int size, String line) {
        maze = new int[size][size];
        String[] nums = line.split(" ");
        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maze[i][j] = Integer.parseInt(nums[j]);
                count++;
            }
        }
    }

    public boolean hasExitPath(int r, int c, boolean[][] visited) {
        if (r < 0 || r >= maze.length || c < 0 || c >= maze[0].length) {
            return false;
        }

        if (visited[r][c] || maze[r][c] == 0) {
            return false;
        }

        visited[r][c] = true;

        if (c == maze[0].length - 1) {
            return true;
        }

        // Explore adjacent cells recursively in the right, down, up, and left directions.
        if (hasExitPath(r, c + 1, visited)) {
            return true;
        }
        if (hasExitPath(r + 1, c, visited)) {
            return true;
        }
        if (hasExitPath(r - 1, c, visited)) {
            return true;
        }
        if (hasExitPath(r, c - 1, visited)) {
            return true;
        }

        return false;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                output.append(maze[i][j]).append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }
}
