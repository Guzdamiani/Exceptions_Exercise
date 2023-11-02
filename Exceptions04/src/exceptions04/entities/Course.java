/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions04.entities;

/**
 *
 * @author guzma
 */
public class Course {

    private String[] alumni;

    public Course() {
    }

    public Course(String[] alumni) {
        this.alumni = alumni;
    }

    public String[] getAlumni() {
        return alumni;
    }

    public void setAlumni(String[] alumni) {
        this.alumni = alumni;
    }

    public void showAlumni() {

        for (int i = 0; i < 10; i++) {
            System.out.println(alumni[i]);
        }
        
    }
}
