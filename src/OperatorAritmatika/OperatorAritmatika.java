
package OperatorAritmatika;


public class OperatorAritmatika {

    
    public static void main(String[] args) {
        double hasil;
        double a= 5;
        double b= 2;
        //Operator Penjumlahan
        System.out.println("---penjumlahan---");
        hasil= a+b;
        System.out.println("a + b = " + hasil);
        
        //Operator Pengurangan
        //System.out.println("---pengurangan---");
        hasil= a-b;
        System.out.println("a - b = " + hasil);
        
        //Operator Perkalian
        System.out.println("---perkalian---");
        hasil= a*b;
        System.out.println("a * b = " + hasil);
        
        //Operator Pembagian
        System.out.println("---pembagian---");
        hasil= a/b;
        System.out.println("a / b = " + hasil);
        
        //Operator Modulua
        System.out.println("---modulus---");
        hasil= a%b;
        System.out.println("a % b = " + hasil);   
        
        //Operator Unary
        System.out.println("Unary");
        hasil = a++;
        System.out.println(hasil);
        hasil = a++;
        System.out.println(hasil);
      //  System.out.println(hasil);
        hasil = ++b;
        System.out.println(hasil);
                
    }
    
}
