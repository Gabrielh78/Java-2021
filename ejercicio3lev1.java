import java.util.Scanner;

public class ejercicio3lev1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int N;
        System.out.println("Introduzca un valor de N: ");
        N = scan.nextInt();
        System.out.println(N/ 10000);
        System.out.println(N/ 1000);
        System.out.println(N/ 100);
        System.out.println(N/ 10);
        System.out.println(N);
    }
}
