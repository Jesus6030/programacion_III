import es.usal.progiii.tools.Esdia;

public class LongitudNombre {
    public static void main(String[] args) {
        String nombre = Esdia.readString("Introduce tu nombre: ");
        String apellido = Esdia.readString("Introduce tu apellido: ");
        int n = "* Nombre".length();
        int m = "* Apellido *".length();
        int a = 2+nombre.length();
        int b = 2+apellido.length();

        int i = 0;
        int j = 0;
        int e1 = 3;
        int e2 = 0;
        int e3 = 3;
        int e4 = 0;
        if (n < a) {
           i = a+e3;
           e1 = a+e3-n;
        }else {
            i = n+e1;
            e3 = n+e1-a;
        }
        if (m < b) {
           j = b+e4+2;
           e2 = b+e4-m;
        }else {
            j = m+e2;
            e4 = m+e2-b;
        }

        System.out.println("*".repeat(i+j));
        System.out.println("* Nombre" + " ".repeat(e1) + "* Apellido"+ " ".repeat(e2) + " *");
        System.out.println("*".repeat(i+j));
        System.out.println("* " + nombre + " ".repeat(e3) + "* " + apellido + " ".repeat(e4) + " *");
        System.out.println("*".repeat(i+j));
    }
}