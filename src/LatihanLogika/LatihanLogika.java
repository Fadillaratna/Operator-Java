
package LatihanLogika;
import java.util.Scanner;

public class LatihanLogika {
    

    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
       int nilaiBenar= 20;
       int nilaiTebakan;
       boolean statusTebakan;
        System.out.print("Masukkan Nilai Tebakan Anda: ");
        nilaiTebakan= userInput.nextInt();
        System.out.println("Nilai Tebakan anda adalah "+ nilaiTebakan );
        statusTebakan= (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda "+ statusTebakan);
        
        System.out.print("Masukkan Nilai Antara 1 dan 20: ");
        nilaiTebakan= userInput.nextInt();
        statusTebakan= (nilaiTebakan > 1)&& (nilaiTebakan < 20);
        System.out.println("Tebakan anda "+ statusTebakan);
        
        
    }
    
}
