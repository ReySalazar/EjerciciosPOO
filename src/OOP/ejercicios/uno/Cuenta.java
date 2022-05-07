package OOP.ejercicios.uno;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar (double cantidad) {
        if (cantidad < 0 ) {
            System.out.println("Error!!, cantidad no admitida");
        } else {
            this.cantidad += cantidad;
        }
    }

    public void retirar (double cantidad) {
        double saldo = this.cantidad - cantidad;
        if ( saldo < 0 ) {
            //System.out.println("Saldo actual es: 0");
            this.cantidad = 0;
        } else {
            //System.out.println("Saldo actual es: " + saldo);
            this.cantidad = saldo;
        }
    }

    @Override
    public String toString() {
        return "Cuenta " +
                "titular = " + titular +
                ", cantidad = " + cantidad +
                " euros";
    }
}
