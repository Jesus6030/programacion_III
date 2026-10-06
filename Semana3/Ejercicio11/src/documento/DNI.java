package documento;

public class DNI {
    
    public static String main(String num){
        int numero = Integer.parseInt(num);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion = numero%23;
        String dni = numero+letras.substring(posicion,posicion+1);
        return dni;
    }
}
