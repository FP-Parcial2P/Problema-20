/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg15;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Mostrar tabla 10x10 con numeros aleatorios y que muestre la suma de filas y columnas
        int [][]matriz = new int [10][10];
        int [][]m = crearTabla(matriz);
        mostrarTablaYSumas(m);       
    }
    public static int[][]crearTabla(int [][]m){
        int x;
        Random n = new Random(); //m [i][j]= n.nextInt();
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
            m[i][j] = n.nextInt(100); //numeros aleatorios del 0 al 100
            if(j==10){
                x=0;
                for (j=0; j<m.length; j++){
                    x = m[i][j] + x;          
        }
                m[i][j]=x;
        }
        }
        }
        return m;
}
    public static int [][] sumas(int[][] m){
        
    }
    public static void mostrarTablaYSumas(int[][]m){ //Se muestran las filas y las columnas
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.println(m[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
