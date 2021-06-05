import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ejercicio3_level2 {
    public static void main(String[] args) {
        Random rndm = new Random();
        ArrayList<String> baraja = new ArrayList();
        cargar(baraja);
        mostrar(baraja);

        Collections.reverse(baraja);
        System.out.println("Lista en reversa");
        mostrar(baraja);

        Collections.shuffle(baraja, rndm);

        System.out.println("Lista Desordenada");
        mostrar(baraja);

    }
    public static void cargar(ArrayList<String> baraja) {
        baraja.add("A");
        for (int i = 2; i < 10; i++) {
            baraja.add(String.valueOf(i));
        }
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");
    }

    public static void mostrar(ArrayList<String> baraja) {
        for (String item : baraja) {
            System.out.println(item);
        }
    }

    }