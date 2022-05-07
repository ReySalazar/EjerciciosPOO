package OOP.ejercicios.uno;

public class CuentaApp {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("DiscoDurodeRoer");
        Cuenta cuenta2 = new Cuenta("Fernando", 300);

//Ingresa dinero en las cuentas
        cuenta1.ingresar(300);
        cuenta2.ingresar(400);

//Retiramos dinero en las cuentas
        cuenta1.retirar(500);
        cuenta2.retirar(100);

//Muestro la información de las cuentas
        System.out.println(cuenta1); // 0 euros
        System.out.println(cuenta2); // 600 euros
    }
}
