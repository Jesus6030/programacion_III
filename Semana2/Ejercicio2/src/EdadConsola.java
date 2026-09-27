import java.io.Console;


public class EdadConsola {
    public static void main(String[] args) {
        Console console = System.console();

        String añoNacer = console.readLine("Ingrese su año de nacimiento: ");
        String añoActual = console.readLine("Ingrese el año actual: ");
        int edad = Integer.parseInt(añoActual) - Integer.parseInt(añoNacer);
        System.out.printf("Su edad son: %d %s", edad, "años");
    }
}
