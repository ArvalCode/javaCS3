public class AtCounterRunner
 {
    public static void main(String[] args) 
    {
        AtCounter mat = new AtCounter(6, 36);
        System.out.println(mat);

        boolean[][] visited = new boolean[6][36];
        System.out.println(mat.countConnectedAts(0, 0, visited));

        // another test case

        AtCounter mat2 = new AtCounter(9, 9);
        System.out.println(mat2);

        boolean[][] visited2 = new boolean[9][9];
        System.out.println(mat2.countConnectedAts(0, 0, visited2));
    }
  }