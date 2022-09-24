package Library;

import Functions.Choosething;

import java.util.Scanner;

public class Book extends Choosething {
    private static String editorial;
    private static String autor;
    static Scanner in= new Scanner(System.in);
    public Book(int Id, String title, String topic, int amount, int thing){
        super(Id, title, topic, amount, thing);
        System.out.println("Ingrese el autor: ");
        setAutor(in.nextLine());
        System.out.println("Ingrese editorial: ");
        setEditorial(in.nextLine());
    }

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
