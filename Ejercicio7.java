package Level_2;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un numero");
        num1 = scan.nextInt();
        System.out.println("Ingrese un segundo numero mayor al anterior");

        while (true) {
            num2 = scan.nextInt();
            if (num1 < num2) {
                break;
            }
            System.out.println("Ingrese el numero nuevamente (TIENE QUE SER MAYOR AL PRIMER NUMERO) ");
        }
        
        System.out.println("-----------------------------------");

        String[] array = generarArray(num1, num2);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        scan.close();
    }

    public static String[] generarArray (int num1, int num2){
        int longitud = num2 - num1;

        String[] array2 = new String[longitud];
        int j = 0;
        for (int i = num1; i < num2; i++ ) {
            array2[j] = determinarElto(i);
            j++;
        }
        return array2;
    }

    public static String determinarElto (int num) {
        String result = String.valueOf(num);

        if (num % 2 == 0 && num % 3 == 0){
            result = "FizzBuzz";
        }else if (num % 3 == 0){
            result = "Buzz";
        }else if (num % 2 == 0){
            result = "Fizz";
        }
        return result;
    }
}
