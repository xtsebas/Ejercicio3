package Library;

import java.util.Scanner;

public class Book {
    private static String editorial;
    private static String autor;
    static Scanner in= new Scanner(System.in);
    public Book(){
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
