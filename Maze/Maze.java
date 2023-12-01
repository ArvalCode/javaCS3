public class Maze {
  private static final int[][] DIRECTIONS = {{0,1},{1,0},{0,-1},{-1,0}};

  private int[][] mazeGlobal;

  public Maze(int size, String line) { //Where the error occurs, must make changes here
  mazeGlobal = new int[size][size];
  for(int r = 0; r < size; r++) {
    for(int c = 0; c < size; c++) {      
mazeGlobal[r][c] = line.charAt(r * size + c) - '0';
    }
  }
}


  public boolean hasExitPath(int[][] maze) {
    int rows = maze.length;
    int cols = maze[0].length;
    boolean[][] visited = new boolean[rows][cols];

    return dfs(maze, visited, 0, 0);
  }

  private static boolean dfs(int[][] maze, boolean[][] visited, int row, int col) {
    int rows = maze.length;
    int cols = maze[0].length;

    if (col == cols -1) {
      return true;
    }

    visited[row][col] = true;

    for (int[] direction: DIRECTIONS) {
      int newRow = row + direction[0];
      int newCol = col + direction[1];

      if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && maze[newRow][newCol] == 1 &&!visited[newRow][newCol]) {
        if (dfs(maze,visited,newRow,newCol)) {
          return true;
        }
      }
    }
    return false;
  }

  public int[][] returnMaze() {
    return mazeGlobal;
  }
  
  public String toString() {
    String output = "";
    for(int r = 0; r < mazeGlobal.length; r++) {
      for(int c = 0; c < mazeGlobal[0].length; c++) {
        output += mazeGlobal[r][c] + " ";
      }
      output += "\n";
    }
    return output;
  }

}