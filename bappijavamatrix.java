package javamatrix;

public class FirstApp {
    
    public static void main(String[] args) { 
    
        int TeamA [][] = {
                         {3, 8, 5},
                         {5, 6, 6}
                       };
        int TeamB [][] = {
                         {3, 4},
                         {2, 3},
                         {1, 2}
                       };
        int result = 0;
        int Matrix [][] = new int [2][2];
        
        for (int g=0; g<2; g++){
            
            for (int s=0; s<2; s++){
                
                for (int b=0; b<3; b++){
                
                result = result + TeamA [g][b] * TeamB [b][s];
                }
                Matrix[g][s] = result;
                result = 0;
            }
        }
        for (int g[] : Matrix){
          for (int s : g){
       System.out.print(s + "  ");
    }
    System.out.println();
 }
     }
}
  