package Library;
/*
 *Clase hija de la clase Choosething, del tipo magazine
 */

import Functions.Choosething;

import java.util.Scanner;

public class Magazine extends Choosething {
    /*
     *variables de la clase
     */
    private static int year;
    private static int number;
    static Scanner in= new Scanner(System.in);

    /*
     *constructor para la creacion de objeto tipo Choosething: Book
     * @param Id del magazine, title el titulo del magazine, topic el tipo de materia, amount la cantidad que se ingresara, thing el tipo de objeto que se ingresara
     */
    public Magazine(int Id, String title, String topic, int amount, int thing){
        super(Id, title, topic, amount, thing);
        System.out.println("Ingrese el año de creacion: ");
        setYear(in.nextInt());
        in.nextLine();
        System.out.println("Ingrese el numero de la revista: ");
        setNumber(in.nextInt());
        in.nextLine();
    }
    /*
     *getters y setters de la clase book
     */
    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
