package OOP.ejercicios.polimorfismo_uno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Cadete("José Lee", 25, 65000);
        Empleado e2 = new Cadete("Barto Simpu", 32, 68000);
        Empleado e3 = new Administrativo("Roberto Carlos", 22, 70000);
        Empleado e4 = new Jefe("Rey Salazar", 37, 85000, 3);

        List<Empleado> empleados = new ArrayList<>();
        empleados.addAll(Arrays.asList(e1, e2, e3, e4));

        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleadoActual = empleados.get(i);
            empleadoActual.calculoDeBono();
        }
    }
}
