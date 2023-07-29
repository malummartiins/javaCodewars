import java.util.Scanner;

public class Growth {
    public static void main(String[] args) {
        /* y = a(1+ r) ^x
        a = valor inicial
         r = taxa de crescimento
         x = intervalo

         o que vamos fazer é pedir ao usuário esses num, por eles na 
         formula e retornar o resultado;*/

        System.out.println(" Let's calculate subs!");
        System.out.println("This program uses y = a(1+ r) ^x");

        System.out.println("Enter initial value (a): ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Enter growth rate (r): ");
        double r = scan.nextDouble();

        System.out.println("Enter time interval in days (x): ");
        int x = scan.nextInt();

        System.out.println(calculateSubs(a, r, x));

    }


    public static int calculateSubs (int a, double r, int x){
        return (int) (a * Math.pow((1 + r), x));
        
    }
    
}
