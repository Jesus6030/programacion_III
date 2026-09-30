import es.usal.progiii.tools.Esdia;

public class Media {
    public static void main(String[] args) {
        int N = Esdia.readInt("Introduce el número de elementos: ");
        while (N <=0){
            System.err.println("El valor introducido no es un número entero válido. Inténtelo de nuevo.");
            int N1 = Esdia.readInt("Introduce el número de elementos: ");
            N = N1;
        }
        double suma = 0;
        for (int i=0; i<N; i++){
            double num = Esdia.readDouble("Introduce un número: ");
            suma += num;
            }
            System.out.println("La media es: " + suma / N);
    }
        
}
