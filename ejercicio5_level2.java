import java.util.ArrayList;

public class ejercicio5_level2 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList();
        ArrayList<Integer> valorPorHora = new ArrayList();
        ArrayList<Integer> totales = new ArrayList();
        int totalFinal = 0;
        cargarHoras(horasTrabajadas);
        cargarValores(valorPorHora);
        cargarTotales(horasTrabajadas, valorPorHora, totales);
        System.out.println(totales);

        for (Integer item : totales) {
            totalFinal += item;
        }
        System.out.println("Total Final :" + totalFinal);
    }

    public static void cargarHoras(ArrayList<Integer> array) {
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(4);
        array.add(5);
    }

    public static void cargarValores(ArrayList<Integer> array) {
        array.add(350);
        array.add(345);
        array.add(550);
        array.add(600);
        array.add(320);
    }

    public static void cargarTotales(ArrayList<Integer> horas, ArrayList<Integer> valores, ArrayList<Integer> totales) {
        for (int i = 0; i < horas.size(); i++) {
            totales.add(horas.get(i) * valores.get(i));
        }

    }

    }
