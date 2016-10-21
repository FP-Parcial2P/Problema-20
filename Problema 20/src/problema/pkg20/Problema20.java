/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg20;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Programa para calcular si dos numeros son amigos
        int a,b;
        a=solicitarNumeros(); //Pedimos dato a
        b=solicitarNumeros(); //Pedimos dato b
        determinarAmigos(a,b);//Calculamos y mostramos si son o no numeros amigos
        
    }
    public static int solicitarNumeros(){ //Pedimos los dos numeros en un método y que sean positivos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce dos numeros: ");
        int n=entrada.nextInt();
        while (n <0){  //Mientras sean negativos...
            System.out.print("Los numeros tienen que ser positivos vuelve a introducirlo: ");
            n = entrada.nextInt();
        }
        return n;
    }
    public static void determinarAmigos(int a, int b){ //Operación 
        int suma1=0, suma2=0;
        for(int i=1;i<a;i++){ 
            if(a%i==0){           //Si el resiudo de a entre i es 0
                suma1 = suma1 + i;  //Ir sumando los divisores
            }
            }
            for(int j=1;j<b;j++){  
                if (b%j==0){       //Si el residuo de b entre j es 0
                    suma2 = suma2 + j;  //Ir sumando los divisores
                }
        }
        if((suma1 == b) && (suma2 ==a)){ // Si los divisores de "a" son iguales a "b" y viceversa ...
        System.out.print("Los numeros "+a+" y "+b+" son numeros amigos."); 
    }
        else {System.out.print("Los numeros "+a+ " y "+b+" no son numeros amigos.");}
        System.out.println("");
    }
}
