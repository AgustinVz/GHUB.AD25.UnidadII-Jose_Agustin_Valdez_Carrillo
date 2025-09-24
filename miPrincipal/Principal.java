package miPrincipal;
import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            menu();
            opc=sc.nextInt();
        
            switch (opc) {
                case 1:
                    AppMuestraNaturales.leer_numeros();
                    break;
                case 2:
                    AppPared.inicio();
                    break;
                case 3:
                    AppFactorial.inicio();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
            
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opc!=0);

    }
    private static void menu(){
        System.out.println();
        System.out.println("Menu Principal");
        System.out.println("1.Imprimir n numeros naturales");
        System.out.println("2.Calcular factorial de n");
        System.out.println("3.Calcular numero de fibonacci");
        System.out.println();
        System.out.println("0.Salir");
        System.out.println("Seleccionje la opcion deseada");
    }
}