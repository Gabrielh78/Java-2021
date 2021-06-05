import java.util.Scanner; 

public class Ejercicio8level1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Por favor ingrese nombre y apellido ");
        String nombre = scan.nextLine();
        System.out.println("Por favor ingrese su edad ");
        int edad = scan.nextInt();
        System.out.println("Por favor ingrese direccion ");
        scan.nextLine();
        String direccion = scan.nextLine();
        System.out.println("Por favor ingrese ciudad");
        String ciudad = scan.nextLine();
        scan.close();
        System.out.println(ciudad + " " + direccion + " " + edad + " " + nombre);
    }
    
}
