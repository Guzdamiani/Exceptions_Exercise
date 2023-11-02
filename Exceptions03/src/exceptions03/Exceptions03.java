/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package exceptions03;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Exceptions03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Enter a number:");
        String n1 = leer.next();
        System.out.println("Enter another number:");
        String n2 = leer.next();

        Integer result = null;
        int num1 = 0;
        int num2 = 0;

        try {
            num1 = parseInt(n1);
            num2 = parseInt(n2);

            NumberDivision nd = new NumberDivision(num1, num2);

            result = nd.division();

        } catch (NumberFormatException e) {
            System.out.println("Error parsing the number: " + e.getMessage());
        }

        if (result != null) {
            System.out.println("The result of " + num1 + " / " + num2 + " = " + result);
        }

    }

}
