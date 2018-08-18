package imageanime;
import java.awt.*;
import java.applet.*;




	public class anime extends Applet 

	  {
		

	    Image pic;
		Image pic1;

	    public void init()

	      {

	        pic=getImage(getDocumentBase(),"pupp.jpg");
		//pic.start();
		pic1=getImage(getDocumentBase(),"pupp2.jpg");
		//pic1.start();

	      }
	  

	    public void paint(Graphics grp)

	      {
	        for(int i=50;i<600;i++)

	          {
		    grp.drawImage(pic1, 10,30,this);
		                grp.drawImage(pic,i,80,this);
	            try

	              {
			

	                Thread.sleep(100);

	              }

	            catch(Exception e){}

	          }
	      }

	      
	}
	    
	  
	

