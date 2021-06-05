import java.util.Scanner;

public class Ejercicio9level1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner (System.in);
        System.out.println("por favor ingrese una palabra");
        String palabra = scan.nextLine();
        
        System.out.println("por favor ingrese una letra");
        String letra = scan.nextLine();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++){
            if (letra.charAt(0) == palabra.charAt(i)){
                contador ++;
            }
        }
        System.out.println("La letra " + letra.charAt(0) + " se encuentra " + contador + " veces en la palabra");
    }
}
