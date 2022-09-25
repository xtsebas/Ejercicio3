package Library;
/*
 *Clase hija de la clase Choosething, del tipo book
 */

import Functions.Choosething;

import java.util.Scanner;

public class Book extends Choosething {
    /*
     *variables de la clase
     */
    private static String editorial;
    private static String autor;
    static Scanner in= new Scanner(System.in);

    /*
     *constructor para la creacion de objeto tipo Choosething: Book
     * @param Id del book, title el titulo del book, topic el tipo de materia, amount la cantidad que se ingresara, thing el tipo de objeto que se ingresara
     */
    public Book(int Id, String title, String topic, int amount, int thing){
        super(Id, title, topic, amount, thing);
        System.out.println("Ingrese el autor: ");
        setAutor(in.nextLine());
        System.out.println("Ingrese editorial: ");
        setEditorial(in.nextLine());
    }
    /*
     *getters y setters de la clase book
     */
    public static String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
