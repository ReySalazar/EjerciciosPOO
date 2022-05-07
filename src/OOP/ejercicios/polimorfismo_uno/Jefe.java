package OOP.ejercicios.polimorfismo_uno;

import java.util.List;

public class Jefe extends Empleado{
    private int cantidadEmpleadosACargo;
    public Jefe(String nombre, int edad, double salario, int cantidadEmpleadosACargo) {
        super(nombre, edad, salario);
        this.cantidadEmpleadosACargo = cantidadEmpleadosACargo;
    }

    public int getCantidadEmpleadosACargo() {
        return cantidadEmpleadosACargo;
    }

    public void setCantidadEmpleadosACargo(int cantidadEmpleadosACargo) {
        this.cantidadEmpleadosACargo = cantidadEmpleadosACargo;
    }


    public void calculoDeBono(){
        System.out.println("Bono jefe: " + (getSalario() * this.cantidadEmpleadosACargo));
    }
}
