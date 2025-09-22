package miPrincipal;

import java.util.Scanner;

public class AppMuestraNaturales {
    static Scanner sc = new Scanner(System.in);
    public static void leer_numeros() {
        System.out.println("Introduce cantidad de numeros: ");
        int n = sc.nextInt();

        System.out.println("Versión iterativa");
        imprimir_numeros_ite(n);
        System.out.println("Versión recursiva");
        imprimir_numeros_rec(n);
    }
    //Declaren una funcion de nombre imprimir numero que reciba 
    //como parametro n y luego imprima los primeros numeros naturales por lo que no retorna nada
    public static void imprimir_numeros_ite(int a) {
         for(int i = 1; i<=a; i++ ){
            System.out.println(i+"  ");
        }
        System.out.println();
    }
    public static void imprimir_numeros_rec(int a) {

        
        if(a>1)
        imprimir_numeros_rec(a-1);
        System.out.println(a+"  ");
        
    }
}
