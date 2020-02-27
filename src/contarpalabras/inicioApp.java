package contarpalabras;

import java.util.Arrays;
import java.util.Scanner;

public class inicioApp {

   static char[] letras;
     static int[] contador;
    static int palabras;
   
   static int caracterblanco=0;
    
    
    
    public inicioApp() {
        letras = new char[65536];
        contador = new int[65536];
        palabras = 0;
    }

    public static void contarPalabras(String cadena) {
        char vacio = ' ';
        ///Hay aveces que el lenght no se pone automativo
        
        for (int i = 0; i < cadena.length(); i++) {
            char cantidad = cadena.charAt(i); //Nos cuenta la longitud de la cadena letra a letra
                int cantidadI = cantidad; //Le asignamos la variable cantidadI de tipo entero a cadena que es tipo char
               
                    
                    if (cantidad ==' ' && vacio!=' ') {
                        palabras++;
                }
                    vacio=cantidad;
        }
        palabras++;

    }
         

    public void mostrarResultado(int numPal, int numChar) {

        System.out.println("La cadena tiene estas palabras: " + numPal);
        System.out.println("La cadena tiene estas letras: " + numChar);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicioApp letras = new inicioApp();
        System.out.println("Introduce una cadena de carácteres");
        String cadena = sc.nextLine().trim();

       letras.contarPalabras(cadena);
       letras.mostrarResultado(palabras,caracterblanco);
    }

}

       
