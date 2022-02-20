
package OperatorLogika;


public class OperatorLogika {

  
    public static void main(String[] args) {
        boolean a, b, hasil;
       //AND
       System.out.println("---AND(&&)---");
       a= true;
       b= true;
       hasil= (a&&b);
       System.out.printf("%s && %s ---> %s \n", a,b,hasil);
       
       a= true;
       b= false;
       hasil= (a&&b);
       System.out.printf("%s && %s ---> %s \n", a,b,hasil);
       
       a= false;
       b= true;
       hasil= (a&&b);
       System.out.printf("%s && %s ---> %s \n", a,b,hasil);
       
       a= false;
       b= false;
       hasil= (a&&b);
       System.out.printf("%s && %s ---> %s \n", a, b,hasil);
       
       //OR
       System.out.println("---OR(||)---");
       a= true;
       b= true;
       hasil= (a||b);
       System.out.printf("%s || %s ---> %s \n", a,b,hasil);
       
       a= true;
       b= false;
       hasil= (a||b);
       System.out.printf("%s || %s ---> %s \n", a,b,hasil);
       
       a= false;
       b= true;
       hasil= (a||b);
       System.out.printf("%s || %s ---> %s \n", a,b,hasil);
       
       a= false;
       b= false;
       hasil= (a||b);
       System.out.printf("%s || %s ---> %s \n", a, b,hasil);
       
       //XOR
       System.out.println("---XOR(^)---");
       a= true;
       b= true;
       hasil= (a^b);
       System.out.printf("%s ^ %s ---> %s \n", a,b,hasil);
       
       a= true;
       b= false;
       hasil= (a^b);
       System.out.printf("%s ^ %s ---> %s \n", a,b,hasil);
       
       a= false;
       b= true;
       hasil= (a^b);
       System.out.printf("%s ^ %s ---> %s \n", a,b,hasil);
       
       a= false;
       b= false;
       hasil= (a^b);
       System.out.printf("%s ^ %s ---> %s \n", a, b,hasil);
       
       //NOT
       System.out.println("---NOT(!)---");
       a= true;
       hasil= (!a);
       System.out.printf("%s (!) ---> %s \n", a,hasil);
       
       a= false;
       hasil= (!a);
       System.out.printf("%s (!) ---> %s \n", a,hasil);
    }
}
