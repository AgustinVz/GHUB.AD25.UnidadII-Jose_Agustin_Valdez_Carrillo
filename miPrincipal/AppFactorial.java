package miPrincipal;
import java.util.Scanner;
import java.math.BigInteger;
public class AppFactorial {
    public static void inicio() {
        Scanner sc = new Scanner(System.in);

        int n;
        do{
            System.out.println("Proporciona el valor de n entre 1-20");
            try{
            n = sc.nextInt();
            }catch(Exception e){
                System.out.println("Valor ivalido, intente de nuevo!");
                sc.nextLine();
                n =-1;
            }
        }while(n<1 || n>20);
        
        System.out.println("Version Iterativa");
        System.out.println((n +" ! =" +factorial_ite(n)));
        System.out.println("Version Recursiva");
        System.out.println((n +" ! =" +factorial_rec(n)));

    }
    private static BigInteger factorial_ite(int n){
        BigInteger fact = BigInteger.ONE;
        for(int i = n; i>1; i--)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
    private static BigInteger factorial_rec(int n){
        if(n==0)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(factorial_rec(n-1));
    }
}
