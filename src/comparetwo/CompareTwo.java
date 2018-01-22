/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author isamach
 */
public class CompareTwo {

    /**
     * @param args the command line arguments
     */

   
       static String arrayLines1[] = new String[11];
     static String arrayLines2[] = new String[11];
      
  public static void main(String args[]) throws FileNotFoundException, IOException  {  
             String contents1 = null;  
             String contents2 = null;
             BufferedReader br1 = null;
             BufferedReader br2 = null;
             String filename = "volantes_tramite.txt";
             String filename2 = "volantes_firmados.txt";
          
             int count1 = 0 ;
             int count2 = 0 ;
          
      
            br1 = new BufferedReader(new FileReader(filename));
            br2 = new BufferedReader(new FileReader(filename2));
                
            //Sirve para ir contano los numeros en cada posicion
                while ((contents1 = br1.readLine()) != null)  
                 {  
                    arrayLines1[count1] = contents1 ;
                    count1++;
                 }  
                while ((contents2 = br2.readLine()) != null)  
                 {  
                    arrayLines2[count2] = contents2 ;
                    count2++;
                 }
          
              displayRecords() ;
                
                System.out.println("Total Archvos"+filename+" "+ count1);
                System.out.println("Total Archvos"+filename2+" "+ count2);
 }
                                 
     public static void displayRecords() throws IOException {
         for (int i = 0 ; i <= arrayLines1.length-1 ; i++) {
             for(int j = i+1 ; j <= arrayLines2.length-1 ; j++){
                 if(arrayLines1[i].equals(arrayLines2[j]) && (i != j)){
                  System.out.println("Duplique elements"+arrayLines1[j]);   
                  //No entra ni ve que existan numeros duplicados
                 }
                 
                
             }
       }
        
                     System.out.println("No existen numeros duplicados");
                
       }
}
