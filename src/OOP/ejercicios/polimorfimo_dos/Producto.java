package OOP.ejercicios.polimorfimo_dos;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal(int cantidad) {
        return this.precio * cantidad;
    }

    public double getTotal(String descuento, int cantidad) {
        String s = "Aplicar descuento";
        if ( s.compareTo(descuento) == 0) {
            return (this.precio / 2) * cantidad;
        } else {
            return getTotal(cantidad);
        }
    }
}
