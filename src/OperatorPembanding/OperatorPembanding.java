
package OperatorPembanding;


public class OperatorPembanding {

    
    public static void main(String[] args) {
       int a,b;
       boolean hasil;
       //Equel(Persamaan)
       System.out.println("===persamaan===");
       a= 9;
       b= 9;
       hasil = (a==b);
        System.out.println(a + " == " + b + " "+ hasil );
       
       a= 20;
       b= 15;
       hasil = (a==b);
       System.out.printf("%d == %d ---> %s \n", a,b,hasil );
       
       //Not Equel (Pertidaksamaan)
       System.out.println("===pertidaksamaan===");
       a= 9;
       b= 9;
       hasil = (a!=b);
       System.out.printf("%d != %d ---> %s \n", a,b,hasil );
       
       a= 20;
       b= 15;
       hasil = (a!=b);
       System.out.printf("%d != %d ---> %s \n", a,b,hasil );
       
       //Greater Than (Lebih Dari)
       System.out.println("===lebih dari===");
       a= 21;
       b= 15;
       hasil = (a>b);
       System.out.printf("%d > %d ---> %s \n", a,b,hasil );
       
       a= 15;
       b= 20;
       hasil = (a>b);
       System.out.printf("%d > %d ---> %s \n", a,b,hasil );
               
       //Less Than (Kurang Dari)
         System.out.println("===kurang dari===");
       a= 21;
       b= 15;
       hasil = (a<b);
       System.out.printf("%d < %d ---> %s \n", a,b,hasil );
       
       a= 15;
       b= 20;
       hasil = (a<b);
       System.out.printf("%d < %d ---> %s \n", a,b,hasil );
       
       //Greater Than Equel (Lebih dari dan Sama)
       System.out.println("===sama dan lebih dari===");
       a= 15;
       b= 15;
       hasil = (a>=b);
       System.out.printf("%d >= %d ---> %s \n", a,b,hasil );
       
       a= 15;
       b= 20;
       hasil = (a>=b);
       System.out.printf("%d >= %d ---> %s \n", a,b,hasil );
       
       a= 20;
       b= 15;
       hasil = (a>=b);
       System.out.printf("%d >= %d ---> %s \n", a,b,hasil );
       
       //Less Than Equel (Sama dan Kurang Dari)
       System.out.println("===sama dan kurang dari===");
       a= 15;
       b= 15;
       hasil = (a<=b);
       System.out.printf("%d <= %d ---> %s \n", a,b,hasil );
       
       a= 15;
       b= 20;
       hasil = (a<=b);
       System.out.printf("%d <= %d ---> %s \n", a,b,hasil );
       
       a= 20;
       b= 15;
       hasil = (a<=b);
       System.out.printf("%d <= %d ---> %s \n", a,b,hasil );
               
    }
    
}
