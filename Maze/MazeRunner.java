import java.util.*;
import java.io.*;

public class MazeRunner {

  public static void main(String[] args) throws Exception {


    Scanner fileScanner = new Scanner(new File("/workspaces/javaCS3/Maze/maze.dat"));

    while(fileScanner.hasNextLine()) {
      int size = fileScanner.nextInt();
      String mazeLine = fileScanner.nextLine();

      Maze maze = new Maze(size, mazeLine); //Protect until the end of making the maze

      if(maze.hasExitPath(maze.returnMaze())) {
        System.out.println("exit found");  
      }
      else {
        System.out.println("exit not found");
      }

      System.out.println(maze);
    }

  }

}