/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.multidimen2;

/**
 *
 * @author PC
 */
public class ARRAYMULTIDIMEN2 {

    /**
     * @param args the command line arguments
     */
   
       int nis [] [] = {{210651}, {210652}, {210653}};
       String nama [] [] = {{"ADE"}, {"GALIH"}, {"BAIHAQI"}};
       public void tampil (String n) {
           System.out.println("Identitas Siswa Angkatan 24");
       }
       public void namanis (int n) {
           for (int i = 0; i<1; i++) {
               for (int j = 0; j<1; j++) {
                   System.out.println(nama[1][j]+":" + nis[1][j]);
                   
               }
        }
        }
       public static void main (String[] args) {
           ARRAYMULTIDIMEN2 siswa = new ARRAYMULTIDIMEN2();
           siswa.tampil (null);
           siswa.namanis(0);
       }
}

           
           
           
           
           
           
           
       
    
    

