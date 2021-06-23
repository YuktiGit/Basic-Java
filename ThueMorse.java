 class ThueMorse {  
    static String complement(String s) { 
        String comps = ""; 
        for (int i = 0; i < s.length(); i++) { 
            if (s.charAt(i) == '-') 
                comps += '+';  
            else
                comps += '-';          
        } 
          return comps ; 

         for (int i = 1; i < s.length(); i++){
            System.out.println();
            }
        }
           
      
    static String nthTerm(int n) 
    { 
        String s = "-"; 
        for (int i = 1; i < n; i++)  
            s += complement(s);   
        return s; 
    } 
public static void main(String[] args) 
    { 
        int n = 4; 
        System.out.print(nthTerm(n)); 
    } 
} 
  