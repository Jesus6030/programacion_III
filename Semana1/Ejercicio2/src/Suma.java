import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a, b;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextDouble();
        System.out.println("La suma es: " + (a + b));
        sc.close();
    }
}
