import java.io.Console;

public class Persona_3 {
    //Atributos
    private String nombre;
    private float pesoKg;
    private float estaturaCm;

    //Constructores
    public  Persona_3(String nombre, float pesoKg, float estaturaCm){
        this.nombre = nombre;
        this.pesoKg = pesoKg;
        this.estaturaCm = estaturaCm;
    }

    public float calculoIMC() {
    float estaturaM = this.estaturaCm/100;
    float IMC = this.pesoKg/(estaturaM*estaturaM);
    return IMC; 
    }

    //Pedir número posotivo
    //While y try-catch
    public static float NumeroValido(Console console, String mensaje){
        float numero = 0;
        while (numero <= 0){
            console.printf(mensaje);
            try {
                numero = Float.parseFloat(console.readLine());
                if (numero <= 0) {
                    console.printf("Error: el número debe ser mayor a 0.\n");
                }else{
                    break;
                }
            }catch (NumberFormatException e){
                console.printf("Error: debe introducir un número válido.\n");
            }
        }
        return numero;
    }
    
   //Métodos
    public static void main(String[] args){
        Console console = System.console();
        //Crear objetos
        Persona_3 persona1 = new Persona_3(null, 0, 0);
        Persona_3 persona2 = new Persona_3(null, 0, 0);
        Persona_3 persona3 = new Persona_3(null, 0, 0);
        
    //Información persona 1
        console.printf("Introduzca los datos de la persona 1:\n");
        console.printf("Nombre: ");
        persona1.setNombre(console.readLine());
        persona1.setPesoKg(NumeroValido(console, "Peso en kg: "));
        persona1.setEstaturaCm(NumeroValido(console, "Estatura en cm: "));
    //Información persona 2
        console.printf("Introduzca los datos de la persona 2:\n");
        console.printf("Nombre: ");
        persona2.setNombre(console.readLine());
        persona2.setPesoKg(NumeroValido(console, "Peso en kg: "));
        persona2.setEstaturaCm(NumeroValido(console, "Estatura en cm: "));
    //Información persona 3
        console.printf("Introduzca los datos de la persona 3:\n");
        console.printf("Nombre: ");
        persona3.setNombre(console.readLine());
        persona3.setPesoKg(NumeroValido(console, "Peso en kg: "));
        persona3.setEstaturaCm(NumeroValido(console, "Estatura en cm: "));
        
    //Quién pesa más
        if (persona1.getPesoKg() > persona2.getPesoKg() && persona1.getPesoKg() > persona3.getPesoKg()) {
            console.printf(persona1.getNombre() + " es el que más pesa de los tres.");
        } else if (persona2.getPesoKg() > persona1.getPesoKg() && persona2.getPesoKg() > persona3.getPesoKg()) {
            console.printf(persona2.getNombre() + " es el que más pesa de los tres.");
        } else if (persona3.getPesoKg() > persona1.getPesoKg() && persona3.getPesoKg() > persona2.getPesoKg()) {
            console.printf(persona3.getNombre() + " es el que más pesa de los tres.");
        } else if (persona1.getPesoKg() == persona2.getPesoKg() && persona1.getPesoKg() > persona3.getPesoKg()) {
            console.printf(persona1.getNombre() + " y " + persona2.getNombre() + " son los que más pesan, y pesan lo mismo.");
        } else if (persona1.getPesoKg() == persona3.getPesoKg() && persona1.getPesoKg() > persona2.getPesoKg()) {
            console.printf(persona1.getNombre() + " y " + persona3.getNombre() + " son los que más pesan, y pesan lo mismo.");
        } else if (persona3.getPesoKg() == persona2.getPesoKg() && persona3.getPesoKg() > persona1.getPesoKg()) {
            console.printf(persona3.getNombre() + " y " + persona2.getNombre() + " son los que más pesan, y pesan lo mismo.");
        } else {
        console.printf("Todos pesan lo mismo");
        }

    //Muestras IMC
    console.printf("\nEl IMC de " + persona1.getNombre() + " es " + persona1.calculoIMC());
    console.printf("\nEl IMC de " + persona2.getNombre() + " es " + persona2.calculoIMC());
    console.printf("\nEl IMC de " + persona3.getNombre() + " es " + persona3.calculoIMC());
    }
    

    //Getters y setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public float getPesoKg(){
        return this.pesoKg;
    }
    public void setPesoKg(float pesoKg){
        this.pesoKg = pesoKg;
    }
    public float getEstaturaCm(){
        return this.estaturaCm;
    }
    public void setEstaturaCm(float estaturaCm){
        this.estaturaCm = estaturaCm;
    }
}