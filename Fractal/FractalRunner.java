import javax.swing.JFrame;

public class FractalRunner extends JFrame 
{
	// size of screen
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    
    public FractalRunner() 
    {
        super("Fractal Runner");
        setSize(WIDTH + 100, HEIGHT + 100);
        getContentPane().add(new Gasket());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) 
    {
    	// draws the traingles
        FractalRunner run = new FractalRunner();
    }
}
