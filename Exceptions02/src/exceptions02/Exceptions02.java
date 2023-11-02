/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package exceptions02;

/**
 *
 * @author guzma
 */
public class Exceptions02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] alumni = {"Pedro", "Carlos", "Juan"};

        Course c1 = new Course(alumni);

        try {
            c1.showAlumni();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. The array you want to traverse is smaller than the number of loops. ");
            System.out.println(e.toString());
        }
    }

}
