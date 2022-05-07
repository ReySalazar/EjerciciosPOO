package OOP.ejercicios.cuatro;

public class Rectangulo implements Forma{
    private String nombre;
    private int base;
    private int altura;

    public Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    @Override
    public String toString() {
        return  "Forma: " + this.nombre +
                "\nArea: " + this.calcularArea() +
                "\nPerimetro: " + this.calcularPerimetro();
    }
}
