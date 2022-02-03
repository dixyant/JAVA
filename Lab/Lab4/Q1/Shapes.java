import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

public class Shapes extends JFrame {

	Shapes() {
		setSize(350, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		// oval
        g.setColor(Color.GREEN);
		g.fillOval(160, 50, 100, 80);

		// circle
		g.setColor(Color.GREEN);
		g.fillOval(50, 50, 80, 80);

		// triangle
		g.setColor(Color.BLUE);
		int[] triangleX = { 50, 120, 50 };
		int[] triangleY = { 150, 250, 250 };
		Polygon triangle = new Polygon(triangleX, triangleY, triangleX.length);
		g.fillPolygon(triangle);

		// hexagon
		g.setColor(Color.BLUE);
		int[] hexagonX = { 190, 240, 270, 240, 190, 160 };
		int[] hexagonY = { 150, 150, 200, 250, 250, 200 };
		Polygon hexagon = new Polygon(hexagonX, hexagonY, hexagonX.length);
		g.fillPolygon(hexagon);

		// pentagon
		g.setColor(Color.GREEN);
		int[] pentagonX = { 50, 120, 160, 120, 50 };
		int[] pentagonY = { 300, 300, 350, 400, 400 };

		Polygon pentagon = new Polygon(pentagonX, pentagonY, pentagonX.length);
		g.fillPolygon(pentagon);
	}

	public static void main(String[] args) {
		new Shapes();
	}

}
