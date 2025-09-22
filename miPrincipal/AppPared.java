package miPrincipal;
import java.util.Scanner;
public class AppPared {
    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese altura");
        int altura = sc.nextInt();
        System.out.println("Version iterativa");
        dibujar_metodo_ite(altura);
        System.out.println("Version recursiva");
        dibujar_metodo_rec(altura);
    }
    private static void dibujar_metodo_ite(int a){
        for(int i = 0; i<=a; i++){
            dibujar_una_fila_de_ladrillos();
        }
    }
    private static void dibujar_metodo_rec(int a){
        dibujar_una_fila_de_ladrillos();
        if(a>1)
            dibujar_metodo_rec(a-1);
        
    
    }
    private static void dibujar_una_fila_de_ladrillos() {
        System.out.println("********");
        
        
    }
}
