public class GreatCircle { 
   public static void main(String [] args) { 
        
        double x1 = Double.parseDouble(args[0]);  
        double y1 = Double.parseDouble(args[2]); 
        double x2 = Double.parseDouble(args[1]);
        double y2 = Double.parseDouble(args[3]); 
       
 
        x1 = Math.toRadians(x1); 
        x2 = Math.toRadians(x2); 
        y1 = Math.toRadians(y1); 
        y2 = Math.toRadians(y2); 
    
        double dx = x2 - x1;  
        double dy = y2 - y1; 
        double a = Math.pow(Math.sin(dx/ 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(dy / 2), 2); 
              
        double c = 2 * Math.asin(Math.sqrt(a));
        double r = 6371.0; 
        double dist = c * r;
        System.out.println(dist + " kilomaters"); 
   }
}
  
