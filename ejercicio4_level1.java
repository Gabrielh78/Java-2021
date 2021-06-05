import java.util.Scanner;

public class ejercicio4_level1 {
    /**
     * 
     */
    private static final int _0 = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        scan.close();
        int iFactorial = 1;

        int iNumero = _0;
        for (int x = 2; x <= iNumero; x++)
        iFactorial = iFactorial *x;

        System.out.println("El factorial del número " + Integer.toString(iNumero) + "es "
        + Integer.toString(iFactorial));
        
    }
    
}
