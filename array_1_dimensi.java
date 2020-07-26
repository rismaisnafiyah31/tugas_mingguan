
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
public class array_1_dimensi {
    public static void main(String[] args) {
        int NUT[] = new int[4];
        int NUL[] = new int [4];
        String[] siswa = new String [4];
        int NAB;
        
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i < siswa.length; i++) {
            System.out.println("............");
            System.out.println("Input nama siswa ke-" + (i+1) + "=");
            siswa[i] = input.next();
            System.out.println("...........");
            System.out.println("Nilai ujian tulis =");
            NUT[i] = input.nextInt ();
            System.out.println("Nilai ujian lisan =");
            NUL[i] = input.nextInt();
            System.out.println("..........");
            
            int NA = (int) ((NUT[i]*0.3) + (NUL[i]*0.4));
            System.out.println("Nilai akhir : " + NA);
            
            
        }
        
        
        
        
        
        
        
        
    }
    
}
