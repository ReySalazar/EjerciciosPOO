package OOP.ejercicios.dos;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        /*Persona p1 = new Persona("Rey Salazar", "Av Lacroze 2300", "1427", "Buenos Aires", new Fecha(14,9,1984));
        Persona p2 = new Persona("José Rodriguez", "Palpa 3546", "1543", "La Plata", new Fecha(12,6,2000));
        Persona p3 = new Persona("María Cisneros", "Conde 894", "4532", "Rosario", new Fecha(25,12,2006));

        System.out.println("\n########################\n");
        System.out.println(p1);
        System.out.println("\n########################\n");
        System.out.println(p2);
        System.out.println("\n########################\n");
        System.out.println(p3);
        System.out.println("\n########################\n");
        */

        int[] array = {1, 2, 3, 3, 4, 4, 5, 2}; /* Definición de un array de datos int */
        System.out.println("Elementos del array");
        // Imprime los elementos del array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) { /* Primer ciclo que recorre el array */
            for (int j = i+1; j < array.length; j++) { /* Segundo ciclo que recorre el array */
            /* Evalúa si los elementos son iguales y están en posiciones diferentes */
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Elemento duplicado: " + array[j]);
                }
            }
        }
    }

}
