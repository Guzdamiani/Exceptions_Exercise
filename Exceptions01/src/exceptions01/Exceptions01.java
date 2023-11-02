/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package exceptions01;

import exceptions01.entities.Person;
import exceptions01.services.PersonServices;

/**
 *
 * @author guzma
 */
public class Exceptions01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonServices ps = new PersonServices();
        Person p = null;

        try {
            ps.isOfLegalAge(p);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getLocalizedMessage());
            System.out.println("The method can´t be invoked by a null object.");
        }
    }
    
}
