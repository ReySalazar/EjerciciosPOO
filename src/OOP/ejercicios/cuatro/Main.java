package OOP.ejercicios.cuatro;

public class Main {

    public static void main(String[] args) {
        Forma r = new Rectangulo("Rectángulo", 5, 3);
        Forma c = new Circulo("Círculo", 8);
        Forma t = new Triangulo("Triángulo", 6, 8);

        System.out.println(r);
        System.out.println("###############");
        System.out.println(c);
        System.out.println("###############");
        System.out.println(t);
    }
}
