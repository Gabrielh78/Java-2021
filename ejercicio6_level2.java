import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ejercicio6_level2 {
    public static void main(String[] args) {
        //int dni, String nombreYAp, int horasTrabajadas, int valorPorHora
        Set<Empleado> empleados = new HashSet();
        Map<Integer,Integer> sueldo = new HashMap();
        Empleado juan = new Empleado(37654320, "Juan Perez", 36, 300);
        empleados.add(juan);

        Empleado homero = new Empleado(31235122, "Homero Simpson", 22, 400);
        empleados.add(homero);

        Empleado Elbarto = new Empleado(23347503, "bart Simpson", 16, 200);
        empleados.add(Elbarto);

        for (Empleado empleado : empleados) {
            sueldo.put( empleado.dni,empleado.calcular(empleado.horasTrabajadas,empleado.valorPorHora));
        }

        sueldo.forEach((k,v) -> System.out.println("D.N.I.: "+k+" Sueldo: "+v));

    }
}