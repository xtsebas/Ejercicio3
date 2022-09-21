package Library;

import java.util.Scanner;

public class Magazine {
    private static int year;
    private static int number;
    static Scanner in= new Scanner(System.in);
    public Magazine(){
        System.out.println("Ingrese el año de creacion: ");
        setYear(in.nextInt());
        in.nextLine();
        System.out.println("Ingrese el numero de la revista: ");
        setNumber(in.nextInt());
        in.nextLine();
    }

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
