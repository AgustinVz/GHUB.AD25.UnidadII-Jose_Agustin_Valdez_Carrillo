package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AppFibonacci {
    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        long f;
        do{
            System.out.println("Proporciona valor de numero fibonacci que deseas calcular");
            try{
            n = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Valor invalido, intente de nuevo");
                sc.nextLine();
            }
        }while(n<1||n>100);
        System.out.println("Version Iterativa");
        f = fibonacci_ite(n);
        System.out.println("Numero "+n+" = "+f);
        System.out.println("Version Recursiva");
        f = fibonacci_rec(n);
        System.out.println("Numero "+n+" = "+f);
    }
    public static long fibonacci_ite(int n){
        long f = 1L, r1 = 1, r2 = 1;
        for(int i = 3; i<=n; i++){
            f = r1 + r2;
            r1 = r2;
            r2 = f;
        }
        return f;
    }
    public static long fibonacci_rec(int n){
        long f;
        if(n<=2)
            return 1L;
        else
            f = fibonacci_rec(n-1)+fibonacci_rec(n-2);
        return f;
    }
}
