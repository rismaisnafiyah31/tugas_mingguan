
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class multidimensi {
    public static void main(String[] args){
        
        //masukkan type data
        int[][] nilai = new int[2][2];
        int baris,kolom;
        String [][] convert = new String[2][2];
        
        System.out.println("");
        
        //cara input data pada array 2 dimensi
        for(baris=0;baris<nilai.length;baris++){
        for(kolom=0;kolom<nilai[baris].length;kolom++){
        Scanner bacaRecord = new Scanner(System.in);
        System.out.println("input nilai tabel baris["+baris+"] kolom["+kolom+"]= ");
        nilai [baris][kolom] = bacaRecord.nextInt();
        }
        }
        //cara menampilkan data pada array 2 dimensi
        System.out.println("\n~~~~~~Hasil Nilai ~~~~~");
        for(baris=0;baris<nilai.length;baris++){
        for(kolom=0;kolom<nilai[baris].length;kolom++){
         System.out.println("l" +nilai[baris][kolom]);
        }
        System.out.println(" |\n");
        }
        System.out.println("========");
        
        //cara menampilkan array 2 dimensi yang telah di konversi
        System.out.println("========");
        System.out.println("\n-----hasil nilai berubah ------");
        for(baris=0;baris<nilai.length;baris++){
        for(kolom=0;kolom<nilai[baris].length;kolom++){
            
         //data yanng akan kita kita rubah ke String
         convert[baris][kolom] = Integer.toString(nilai [baris] [kolom]);
         
         //merubah angka 4 menjadi *
         if (convert [baris][kolom].contains("2")){
         convert [baris][kolom] = ("*****");
         System.out.println("|" +convert[baris][kolom]);
         }
         else {
         System.out.println("|" +nilai[baris][kolom]);
         }
        }
            System.out.println(" |\n");
        }
        System.out.println("======");
        
    

             
             
         
}   
            
            
}    
        
            
         
           
        
    
    

