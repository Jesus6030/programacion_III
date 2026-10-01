import java.util.Scanner;

public class ProblemaNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad:");
        int a = sc.nextInt();
        // Consume el entero introducido por el usuario, no el salto de línea
        sc.nextLine(); // **CORREGIDO** Consume el salto de línea pendiente
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine(); // Esto no funciona como se espera, ya que nextLine() captura el salto de línea pendiente
        System.out.println("Su nombre es " + nombre + " y su edad son "+a+" años.");
    }
}
