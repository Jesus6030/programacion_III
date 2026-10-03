import java.io.Console;

public class Persona {
    //Atributos
    private String nombre;
    private float pesoKg;
    private float estaturaCm;

    //Constructores
    public  Persona(String nombre, float pesoKg, float estaturaCm){
        this.nombre = nombre;
        this.pesoKg = pesoKg;
        this.estaturaCm = estaturaCm;
    }
    
   //Métodos
    public static void main(String[] args){
        Console console = System.console();
        //Crear objetos
        Persona persona1 = new Persona(null, 0, 0);
        Persona persona2 = new Persona(null, 0, 0);
        Persona persona3 = new Persona(null, 0, 0);
        
    //Información persona 1
        console.printf("Introduzca los datos de la persona 1:\n");
        console.printf("Nombre: ");
        persona1.setNombre(console.readLine());
        console.printf("Peso: ");
        persona1.setPesoKg(Float.parseFloat(console.readLine()));
        console.printf("Estatura: ");
        persona1.setEstaturaCm(Float.parseFloat(console.readLine()));
    //Información persona 2
        console.printf("Introduzca los datos de la persona 2:\n");
        console.printf("Nombre: ");
        persona2.setNombre(console.readLine());
        console.printf("Peso: ");
        persona2.setPesoKg(Float.parseFloat(console.readLine()));
        console.printf("Estatura: ");
    //Información persona 3
        persona2.setEstaturaCm(Float.parseFloat(console.readLine()));
        console.printf("Introduzca los datos de la persona 3:\n");
        console.printf("Nombre: ");
        persona3.setNombre(console.readLine());
        console.printf("Peso: ");
        persona3.setPesoKg(Float.parseFloat(console.readLine()));
        console.printf("Estatura: ");
        persona3.setEstaturaCm(Float.parseFloat(console.readLine()));
        
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
    public float getEstatutaCm(){
        return this.estaturaCm;
    }
    public void setEstaturaCm(float estaturaCm){
        this.estaturaCm = estaturaCm;
    }
}
