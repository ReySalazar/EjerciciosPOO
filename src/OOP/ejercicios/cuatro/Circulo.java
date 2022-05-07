package OOP.ejercicios.cuatro;

public class Circulo implements Forma{

    private static final double PI = 3.14;
    private String nombre;
    private int radio;

    public Circulo(String nombre, int radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return this.radio * PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }

    @Override
    public String toString() {
        return  "Forma: " + this.nombre +
                "\nArea: " + this.calcularArea() +
                "\nPerimetro: " + this.calcularPerimetro();
    }
}
