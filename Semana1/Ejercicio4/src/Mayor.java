import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        c = sc.nextDouble();
        sc.close();
        
        if (a > b && a > c){
            System.out.println("El mayor número es: " + a);
        } else if (b >a && b > c) {
            System.out.println("El mayor número es: " + b);
        }else if (c > a && c > b) {
            System.out.println("El mayor número es: " + c);
        }else if (a == b && a > c) {
            System.out.println("Los mayores números son: " + a + " y " + b);
        }else if (a == c && a > b) {
            System.out.println("Los mayores números son: " + a + " y " + c);
        }else if (b == c && b > a) {
            System.out.println("Los mayores números son: " + b + " y " + c);
        }else {
            System.out.println("Todos los números son iguales: " + a);
        }
    }
}
