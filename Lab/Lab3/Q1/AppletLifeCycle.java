import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet{

	public void init(){
		System.out.println("Initialized!");
	}

	public void start(){
		System.out.println("START");
	}

	public void paint(Graphics g){
    g.drawString("Graphics", 25, 50);
	}

	public void stop(){
		System.out.println("STOP");
	}
	
	public void destroy(){
		System.out.println("DESTROYss");
	}	
}