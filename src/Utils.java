/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anouar
 */
public class Utils {
     public static double predict(float table[][],int userIndex, int j) {
       
        float denominator = 0f;
        float numerator = 0f;
        int i = 0;

       
          while(i < table.length) {
            
                if( userIndex != i &&  table[userIndex][j] != -1 && table[i][j] != -1) {
                numerator+= cos(table,userIndex,i) * (table[i][j] -vAverage(table,i));
                denominator += Math.abs(cos(table,userIndex,i));
           
                 
            }
            
             i++;  
          }

          if(numerator == 0f)
                    denominator = 1;
        float res = (float) vAverage(table,userIndex)  + numerator / denominator  ;
        table[userIndex][j] = res;
        return  res;
       
    }
         
   
    // V Bar
     static double vAverage(float table[][],int userIndex) {
       
        int i = 0;
        float sum = 0;
        int rateCounter =0;
        while(i < table[0].length) {
             
 
                if(table[userIndex][i] != -1) {
                    sum+= table[userIndex][i] ;
                    rateCounter++;
                }
               

                i++;    
            }
           
        return sum / rateCounter;
 
       
    }
   
 static double cos(float[][] table, int x, int y) {
            float a = 0.0f;
            float c = 0.0f;
            float b = 0.0f;
            int i = 0;
           
            while(i < table[0].length) {
                if(table[x][i] != -1 && table[y][i] != -1) {
                                       
                    a+= table[x][i] * table[y][i];
                    b+= table[x][i] * table[x][i] ;
                    c+=  table[y][i] * table[y][i];

                }
               
             
               
                i++;    
            }
            if(Math.sqrt(c * b)>0)

        return a / Math.sqrt(c * b); 
            else return 0;
    }
 static double[][] similarité(float[][] T) {
          double[][] f = new double[T.length][T.length];
          for (int i = 0 ; i< T.length;i++) 
             for ( int  j = 0 ; j< T.length;j++) {
                 f[i][j]=cos(T, i, j);
             }
          return f;
          
}



 static float[][]  fillMatrix(float[][] filledMat) {
      float[][] f = new float[filledMat.length][filledMat[0].length];

      for (int i = 0 ; i< filledMat.length;i++) 
             for ( int  j = 0 ; j< filledMat[0].length;j++) 
                f[i][j] = filledMat[i][j];
        return f;
  }

    
}
