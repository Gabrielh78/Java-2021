import java.util.Scanner;

public class Ejercicio2level1 {
    public static void main (String[] args) {
        Scanner numero = new Scanner (System.in);
        int numero1, numero2,suma,resta,multi,divi,modulo;
        System.out.print("digite 2 numeros: ");
        numero1 = numero.nextInt();
        numero2 = numero.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        divi = numero1 / numero2;
        modulo = numero1 % numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
        System.out.println("El resto es: "+modulo);


    }
    
}
