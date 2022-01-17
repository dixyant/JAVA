import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
class PolygonDemo extends JFrame{
    PolygonDemo(){
        setSize(1000,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        int x1[]  = {350,300,500};
        int y1[]  = {60,400,400};

		g.setColor(Color.RED);
		g.fillPolygon(x1,y1,3);

		int x2[] = {650,600,800};
		int y2[]  = {60,400,400};

		g.setColor(Color.BLUE);
		g.drawPolygon(x2,y2,3);

		

		int x[]={20,200,100,240,20,20};
		int y[]={50,150,150,300,300,20};
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,6);

		int xx[]={30,170,75,215,30,30};
		int yy[]={65,140,140,290,290,35};
		g.setColor(Color.red);
		g.fillPolygon(xx,yy,6);

		g.setColor(Color.WHITE);
		g.fillArc(50,85,50,50,0,-180);

		g.fillOval(50,200,50,50);
		}
    public static void main(String[] args){
        new PolygonDemo();

    }
} 
