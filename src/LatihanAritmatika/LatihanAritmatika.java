
package LatihanAritmatika;

import java.util.Scanner;

public class LatihanAritmatika {

    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, volume, tinggi;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Panjang = ");
        panjang= userInput.nextInt();
        System.out.print("Lebar = ");
        lebar= userInput.nextInt();
        
        luas= panjang*lebar;
        System.out.println("Luas = " + luas);
        
        System.out.println("Menghitung Volume Balok");
        System.out.print("Tinggi = ");
        tinggi= userInput.nextInt();
        volume= luas*tinggi;
        System.out.println("Volume= " + volume);
    }
    
}
