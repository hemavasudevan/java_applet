package semi;
import java.applet.Applet;  
import java.awt.*; 
	  
		public class semicircle extends Applet{  
		  
		public void paint(Graphics g){  
		g.setColor(Color.yellow);    
		g.drawOval(70,200,30,30); 
		g.fillOval(70,200,30,30);
		
		
		g.setColor(Color.green);
		g.fillArc(270,150,90,90,0,180);  
		
		
		
		g.setColor(Color.blue); 
		g.fillArc(20,20,100,100,180,180);
		  
		}  
		}  
