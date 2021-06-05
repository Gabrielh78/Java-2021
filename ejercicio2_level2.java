import java.util.ArrayList;

public class ejercicio2_level2 {
    private static boolean add;
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList();
        enteros.add(2);
        add = enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);
        System.out.println("Lista inicial");
        mostrar(enteros);
        System.out.println("Tamano :" + enteros.size());
        enteros.add(0, 1);
        enteros.add(7);
        System.out.println("Lista final");
        mostar(enteros);
        System.out.println("Tamano :" + enteros.size());
    }
    private static void mostrar(ArrayList<Integer> enteros) {
    }
    public static void mostar(ArrayList <Integer> array) {
        for (Integer item : array){
            System.out.println(item);
        }
    }
    
}
