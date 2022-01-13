import java.applet.Applet;
import java.awt.Graphics;

public class ParameterPass extends Applet{
  String parameter;
  
  public void init(){
		parameter = getParameter("Parameter");
	}
	
  public void paint(Graphics g){
		g.drawString(parameter, 100, 100);
	}
}