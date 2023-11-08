public class Maze {

  private int[][] maze;

  public Maze(int size, String line) {
    maze = new int[size][size];
    for(int r = 0; r < size; r++) {
      for(int c = 0; c < size; c++) {
        maze[r][c] = line.charAt(r*size + c) - '0'; 
      }
    }
  }

  public boolean hasExitPath(int r, int c) {
    if(r < 0 || c < 0 || r >= maze.length || c >= maze[0].length) {
      return false;
    }
    if(maze[r][c] == 0) {
      return false; 
    }
    if(c == maze[0].length-1) {
      return true;
    }
    maze[r][c] = 0; 
    if(hasExitPath(r-1, c) || hasExitPath(r+1, c) ||  
       hasExitPath(r, c-1) || hasExitPath(r, c+1)) {
      return true;
    }
    maze[r][c] = 1;
    return false;
  }
  
  public String toString() {
    String output = "";
    for(int r = 0; r < maze.length; r++) {
      for(int c = 0; c < maze[0].length; c++) {
        output += maze[r][c] + " ";
      }
      output += "\n";
    }
    return output;
  }

}