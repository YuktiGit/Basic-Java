public class BandMatrix {
 public static void main(String [] args) {
 
     int row;
     int col;
     int star = Integer.parseInt(args[1]);
     int num = Integer.parseInt(args[0]);
     
     	for (row = 0; row < num; row++) { 
			for (col = 0; col < num; col++) { 
           if (col >= row - star && col <= row + star) 
            System.out.print("*");
           else 
            System.out.print("0"); 
        }
        System.out.println();
      }  
 
 }
}