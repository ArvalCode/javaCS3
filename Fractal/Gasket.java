import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;


public class Gasket extends Canvas 
{

	// in graphics, int, int, int, int, int, int out-none, purpose-draw a triangle recursively using the midpoint as the new triangle endpoints
  public void gasket(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int count) 
  {
    
	  // count is the number of times the midline is selected and a new triangle drawin
    if (count > 0) 
    {
    
      // Calculate midpoints
      int mid1X = (x1 + x2) / 2;
      int mid1Y = (y1 + y2) / 2;
      int mid2X = (x2 + x3) / 2; 
      int mid2Y = (y2 + y3) / 2;
      int mid3X = (x3 + x1) / 2;
      int mid3Y = (y3 + y1) / 2;
      
      // Draw lines for the new points
      g.drawLine(x1, y1, x2, y2);
      g.drawLine(x2, y2, x3, y3);
      g.drawLine(x3, y3, x1, y1);
      
      // Recurse with new points
      gasket(g, x1, y1, mid1X, mid1Y, mid3X, mid3Y, count-1); 
      gasket(g, mid1X, mid1Y, x2, y2, mid2X, mid2Y, count-1);
      gasket(g, mid3X, mid3Y, mid2X, mid2Y, x3, y3, count-1);
    }
  }
  
  // in - graphics, out - none, purpose - provide the actual parameters needed to draw the triangles
  public void paint(Graphics g) 
  {
	  // draws a new graphic starting at the coordinates provided. recursively calls itself 8 times
    gasket(g, 50, 500, 500, 500, 275, 50, 8);
  }

}
