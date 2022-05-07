package OOP.ejercicios.polimorfismo_uno;

public class Administrativo extends Empleado{
    public Administrativo(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void calculoDeBono() {
        System.out.println("Bono administrativo: " + (getSalario() * 2));
    }
}
