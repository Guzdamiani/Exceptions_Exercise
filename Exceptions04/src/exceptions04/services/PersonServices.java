/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions04.services;

import exceptions04.entities.Person;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class PersonServices {

    public Person createPerson() {

        Person p = new Person();

        Scanner leer = new Scanner(System.in);

        System.out.println("Enter the name of the person you wish to register: ");
        p.setName(leer.next());

        System.out.println("Enter the age of " + p.getName());
        p.setAge(leer.nextInt());

        String sex;

        do {

            System.out.println("Enter the sex of " + p.getName() + ". To do so, only enter M (male), F (female) or O (other).");
            sex = leer.next();
            sex = sex.toUpperCase();

            if ((sex.equals("M") || sex.equals("F")) || sex.equals("O")) {

                p.setSex(sex);

            } else {
                System.out.println("Invalid option. Please try again.");
            }

        } while (!sex.equals("H") && !sex.equals("M") && !sex.equals("O"));

        System.out.println("Enter the weight (in kg) of " + p.getName());
        p.setWeight(leer.nextInt());

        System.out.println("Enter the height (in mts) of " + p.getName());
        p.setHeight(leer.nextDouble());

        return p;
    }

    public int calculateBMI(Person p) {

        double index = (p.getWeight()) / (p.getHeight() * p.getHeight());
        int result;

        if (index < 20) {
            System.out.println("The person is below his/her ideal weight.");
            result = -1;
        } else if (index <= 25) {
            System.out.println("The person is within the ideal weight range.");
            result = 0;
        } else {
            System.out.println("The person is overweight.");
            result = 1;
        }

        return result;
    }

    public boolean isOfLegalAge(Person p) {

        boolean isOfAge;

        if (p.getAge() >= 18) {
            isOfAge = true;
            System.out.println("The person is of legal age.");
        } else {
            isOfAge = true;
            System.out.println("The person is a minor.");
        }

        return isOfAge;
    }
}
