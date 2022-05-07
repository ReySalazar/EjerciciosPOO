package OOP.ejercicios.tres;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(){
        numerador = 0;
        denominador = 1;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    private int mcd(){
        int u = Math.abs(this.numerador);
        int v = Math.abs(this.denominador);
        if(v == 0){
            return u;
        }
        int r;
        while(v != 0){
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public Fraccion simplificar(){
        int dividir = mcd();
        this.numerador/=dividir;
        this.denominador/=dividir;
        return this;
    }

    public Fraccion sumar(Fraccion f){
        Fraccion c = new Fraccion();
        c.numerador = this.numerador*f.getDenominador() + f.getNumerador() * this.denominador;
        c.denominador = this.denominador * f.getDenominador();
        c.simplificar();
        return c;
    }

    public Fraccion restar(Fraccion f){
        Fraccion c = new Fraccion();
        c.numerador = this.numerador * f.getDenominador() - f.getNumerador() * this.denominador;
        c.denominador = this.denominador * f.getDenominador();
        c.simplificar();
        return c;
    }

    public Fraccion multiplicar(Fraccion f){
        Fraccion c = new Fraccion();
        if (f.getDenominador() == 0) {
            f.setDenominador(1);
        }
        if (this.denominador == 0) {
            this.denominador = 1;
        }
        c.numerador = this.numerador * f.getNumerador();
        c.denominador = this.denominador * f.getDenominador();
        c.simplificar();
        return c;
    }

    public Fraccion dividir(Fraccion f){
        Fraccion c = new Fraccion();
        c.numerador = this.numerador * f.getDenominador();
        c.denominador = this.denominador * f.getNumerador();
        c.simplificar();
        return  c;
    }

    @Override
    public String toString() {
        return  numerador +
                "/" + denominador;
    }
}
