import javax.servlet.*;
import javax.servlet.http.*;

public class ImgCounter implements ServletContextAttributeListener {
  private static int images = -2;
  

  public void attributeAdded(ServletContextAttributeEvent scab) {
   images++;
  }

  public void attributeRemoved(ServletContextAttributeEvent scab) {
   
  }

  public void attributeReplaced(ServletContextAttributeEvent scab) {
 
  }
  
  public static int RetreiveCnt(){
 
 	return images; 
  }
 
}