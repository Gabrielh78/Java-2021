import java.util.ArrayList;
import java.util.List;

public class ejercicio4_level2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        cargar(nombres);

        List<String> cursoUno = nombres.subList(0, 4);
        List<String> cursoDos = nombres.subList(4, 8);
        List<String> cursoTres = nombres.subList(8, 12);

        System.out.println("Curso Uno:");
        System.out.println(cursoUno);
        System.out.println("Curso Dos:");
        System.out.println(cursoDos);
        System.out.println("Curso Tres:");
        System.out.println(cursoTres);

    }

    public static void cargar(ArrayList<String> array) {
        array.add("Adrian");
        array.add("Ivan");
        array.add("Roberto");
        array.add("Dana");
        array.add("Antonella");
        array.add("Tatiana");
        array.add("Gabriel");
        array.add("Bruno");
        array.add("Nahel");
        array.add("Martina");
        array.add("Erik");
        array.add("Elias");
    }



    }