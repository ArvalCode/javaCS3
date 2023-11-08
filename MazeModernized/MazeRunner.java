package MazeModernized;

import java.io.File;
import java.util.Scanner;

public class MazeRunner {

	public static void main(String[] args) throws Exception {
		File file = new File("/workspaces/javaCS3/MazeModernized/maze.dat");
		Scanner fileScanner = new Scanner(file);

		int size = 0;
		int prevSize = 0;
		String matrixBuffer = "";
		String mazeString = "";
		int columnCount = 0;
		while (fileScanner.hasNextInt()) {
			int nextInt = fileScanner.nextInt();
			if (nextInt > 1) {
				prevSize = size;
				size = nextInt;
				System.out.println("size = " + size);

				if (prevSize > 0) {
					Maze maze = new Maze(prevSize, mazeString);

					boolean[][] visited = new boolean[prevSize][prevSize];
					if (maze.hasExitPath(0, 0, visited)) {
						System.out.println("exit found");
					} else {
						System.out.println("exit not found");
						matrixBuffer = "";
					}
				}

			} else {
				columnCount++;
				matrixBuffer += nextInt + " ";
				mazeString += nextInt + " ";
				if (columnCount == size) {
					System.out.println(matrixBuffer);
					columnCount = 0;
					matrixBuffer = "";

				}
			}

		}

		fileScanner.close();

	}
}
