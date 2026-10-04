import java.io.Console;

public class LeerNumericos {

   static Console console = System.console();

    public static int readInt(String mensaje) {
        int num = 0;
        boolean valido = false;
        while (valido == false) {
            try{
                String entrada = console.readLine(mensaje);
                num = Integer.parseInt(entrada);
                valido = true;
            }catch (NumberFormatException e){
                console.printf("Error: el valor introducido no es un entero\n");
            }
        }
        return num;
    }

    public static float readFloat(String mensaje){
        float num = 0;
        boolean valido = false;
        while (valido == false) {
            try{
            String entrada = console.readLine(mensaje);
            num = Float.parseFloat(entrada);
            valido = true;
            } catch (NumberFormatException e){
                console.printf("Error: el valor introducido no es de tipo float\n");
            }
        }
        return num;
    }

    public static double readDouble(String mensaje){
        double num = 0;
        boolean valido = false;
        while (valido == false) {
            try{
            String entrada = console.readLine(mensaje);
            num = Double.parseDouble(entrada);
            valido = true;
            } catch (NumberFormatException e){
                console.printf("Error: el valor introducido no es de tipo double\n");
            }
        }
        return num;
    }

    public static void main(String[] args) {
        readDouble("Introduzca un double: ");
        readFloat("Introduzca un float: ");
        readInt("Introduzca un entero: ");
    }
}
