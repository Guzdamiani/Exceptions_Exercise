/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package exceptions04;

import exceptions04.entities.Course;
import exceptions04.entities.NumberDivision;
import exceptions04.entities.Person;
import exceptions04.services.PersonServices;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Exceptions04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonServices ps = new PersonServices();
        Person p = null;

        try {
            ps.isOfLegalAge(p);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getLocalizedMessage());
            System.out.println("The method can´t be invoked by a null object.");
        }

        String[] alumni = {"Pedro", "Carlos", "Juan"};

        Course c1 = new Course(alumni);

        try {
            c1.showAlumni();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. The array you want to traverse is smaller than the number of loops. ");
            System.out.println(e.toString());
        }

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

            result = nd.division(); //Arithmetic exception is found in PersonServices

        } catch (NumberFormatException e) {
            System.out.println("Error parsing the number: " + e.getMessage());
        }

        if (result != null) {
            System.out.println("The result of " + num1 + " / " + num2 + " = " + result);
        }

    }
}
