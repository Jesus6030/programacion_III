import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese su año de nacimiento: ");
        int añoNacer = sc.nextInt();
        System.out.println("Ingrese el año actual:");
        int añoActual = sc.nextInt();
        sc.close();

        System.out.printf("Su edad son: %d %s", (añoActual - añoNacer), "años");
        
    }
}
