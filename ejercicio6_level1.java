import java.util.Scanner;


public class ejercicio6_level1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa un numero: ");
        int numero1 = scan.nextInt();
        System.out.println("ingresar segundo numero: ");
        int numero2 = scan.nextInt();
        int resultado = 0;

        for (int i = 1; i <= numero2; i++){
            resultado = resultado * numero1;
            scan.close();
        }
        System.out.println("resultado es: " + resultado);
    }

}
