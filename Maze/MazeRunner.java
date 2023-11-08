import java.util.*;
import java.io.*;

public class MazeRunner {

  public static void main(String[] args) throws Exception {


    Scanner fileScanner = new Scanner(new File("maze.dat"));

    while(fileScanner.hasNextLine()) {
      int size = fileScanner.nextInt();
      String mazeLine = fileScanner.nextLine();

      Maze maze = new Maze(size, mazeLine);

      if(maze.hasExitPath(0, 0)) {
        System.out.println("exit found");  
      }
      else {
        System.out.println("exit not found");
      }

      System.out.println(maze);
    }

  }

}