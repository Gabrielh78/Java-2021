import java.util.ArrayList;

public class ejercicio1_level2 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList();
        ciudades.add("bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");
        for (int i = 0; i < ciudades.size(); i++){
            System.out.println("#" + (i + 1) + "-" + ciudades.get (i));
    }
}
    
}
