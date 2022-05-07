package OOP.ejercicios.dos;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha () {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean esMayorQue(Fecha f) {
        if (this.año < f.getAño()) {
            return true;
        } else if (this.año <= f.getAño() && this.mes < f.getMes()) {
            return true;
        } else if (this.año <= f.getAño() && this.mes <= f.getMes() && this.dia < f.getDia()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  " " + dia +
                "-" + mes +
                "-" + año;
    }
}
