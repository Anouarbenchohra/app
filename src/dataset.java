


import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author roott
 */


public class dataset {

    
    public static double[][] readCSV(String file) {
    double [][] matrix = new double[901][1683];
		
        String csvFile = file;
        char c = '\u0009';
        String line = "";
        String csvSplitBy = c+"";
        int i = 0;
        
        
        int x=0;
        int y=0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null && x<900) {

                System.out.println(line.toCharArray());           
            }   

        } catch (Exception e) {
            e.printStackTrace();
        }       
        
        return matrix;

               
    }
    
}
