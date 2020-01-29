package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        int numero, divisor =2;
        boolean esPrimo=true;
        
        System.out.println("Introduzca un numero");
        numero =teclado.nextInt();
        numero--;
        
        while(esPrimo && divisor <numero){
                
                esPrimo=numero%divisor !=0;
                divisor++;
                
            if (esPrimo==true){
                
                System.out.println(numero);
                divisor=2;
                numero--;
            }
            else
                   esPrimo=true;
                   divisor=2;
                   numero--;
        
        }
    }
    
}
