/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package exceptions05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Exceptions05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int randomNumber = (int) (Math.random() * 500) + 1;
        System.out.println(randomNumber);

        System.out.println("RANDOM NUMBER GAME");
        System.out.println("");
        System.out.println("A random number between 1 and 500 has been generated. Your job is to find this number in the least amount of tries.");
        System.out.println("");

        int chosenNumber = 0;
        int tryCount = 0;

        do {
            System.out.println("Choose a number from 1 to 500:");
            System.out.println("");

            try {

                chosenNumber = leer.nextInt();
                tryCount++;

                if (chosenNumber < 1 || chosenNumber > 500) {
                    System.out.println("Please enter a number between 1 and 500.");
                } else if (chosenNumber < randomNumber) {
                    System.out.println("The number is higher than " + chosenNumber + ". Try again.");
                } else if (chosenNumber > randomNumber) {
                    System.out.println("The number is lower than " + chosenNumber + ". Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + tryCount + " attempts.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Try again.");
                tryCount++;
                leer.next();
            }
            
        } while (chosenNumber != randomNumber);

        System.out.println("");
    }

}
