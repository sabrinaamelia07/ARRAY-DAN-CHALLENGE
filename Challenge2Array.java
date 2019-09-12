/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2.array;



/**
 *
 * @author PC
 */
public class Challenge2Array {
    private static Object scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nilai [] = new int [5];
       nilai [0] = 60;
       nilai [1] = 89;
       nilai [2] = 90;
       nilai [3] = 100;
       nilai [4] = 98;
       double ratarata = 0.0;
       for (int i = 0; i<nilai.length; i++)ratarata+=nilai [i];
       ratarata/=nilai.length;
       System.out.println("Nilai Rata-Rata = " + ratarata);
       if(ratarata <= 80) {
           System.out.println("Nilai Rata-Rata Rendah");
       } else{
           System.out.println("Nilai Rata-Rata Tinggi");
           
       }
       
       
       
               
      
       
       
       
       
       
       
        
            
        }
    }
    

