package OOP.ejercicios.dos;

import java.util.Calendar;

public class Persona {
    private String nombre;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    private Fecha fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String codigoPostal, String ciudad, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorDeEdad(){
        Calendar c = Calendar.getInstance();
        int año = c.get(Calendar.YEAR);
        int edad = año - this.fechaNacimiento.getAño();
        if ( edad >= 18 ) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre +
                "\nFecha Nacimiento:" + fechaNacimiento +
                "\nDireccion: " + direccion +
                "\nEs mayor: " + this.esMayorDeEdad() +
                 "\n" + codigoPostal + " " + ciudad ;
    }

}
