/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg11;
import java.util.*;

/**
 *
 * @author Raziel 2
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Convertir a numeros romanos con arreglo
        int n; //Variable de la entrada
        n = solicitarNumero(); //Se solicita numero mediante método
        int numero [] = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; // Arreglo de valores numericos donde cambia el numero romano
        String romano[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; // Numero romano en la posicion de su equivalente
        convertirRomanoYMostrar(n, numero, romano);
        
        
    }
    public static int  solicitarNumero(){ //Solicitamos el numero
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero que quieres convertir a romano: ");
        n = teclado.nextInt();
        return n;
    }
    public static void convertirRomanoYMostrar(int n, int [] numero, String romano []){ //Obtenemos el resultado
        int i = 0;
        while (true)
        {
            if (n == 0)  // Si n = 0 break
                break;
                System.out.print(n + " = " ); // Imprimimos el numero = ...
                while (n > 0)           //Mientras que n no sea 0 repetir el proceso
                { if (n >= numero[i] ){ //Mientras que el numero sea mayor a la posicón
                    System.out.print( romano[i]); // Enseguida del numero imprimimos el numero romano
                    n = n - numero[i]; // Se le resta el numero al resultado hasta que el numero sea menor que la posición
            }
                else 
                    i++; 
        } //Acaba el while
                System.out.print("\n");
}
}
}
