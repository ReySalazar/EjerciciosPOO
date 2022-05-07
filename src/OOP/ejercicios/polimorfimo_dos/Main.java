package OOP.ejercicios.polimorfimo_dos;

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Campera", 5000);

        System.out.println("Total SIN descuento: " + p.getTotal(3));
        System.out.println("Total CON descuento: " + p.getTotal("Aplicar descuento",3));
    }
}
