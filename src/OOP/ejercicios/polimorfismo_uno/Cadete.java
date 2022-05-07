package OOP.ejercicios.polimorfismo_uno;

public class Cadete extends Empleado{
    public Cadete(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    @Override
    public void calculoDeBono() {
        System.out.println("Bono cadete: " + getSalario());
    }
}
