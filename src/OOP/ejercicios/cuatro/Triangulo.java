package OOP.ejercicios.cuatro;

public class Triangulo implements Forma{

    private String nombre;
    private int base;
    private int altura;

    public Triangulo(String nombre, int base, int altura) {
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
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return  "Forma: " + this.nombre +
                "\nArea: " + this.calcularArea();
    }

}
