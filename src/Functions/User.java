package Functions;

import java.util.Scanner;

public class User {
    private static String name;
    private static int In;
    private static String direction;
    private static int amountbooks;
    Scanner in= new Scanner(System.in);

    public User(){
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Ingrese su nombre: ");
        setName(in.nextLine());
        System.out.println("Ingrese su numero de identificacion: ");
        setIn(in.nextInt());
        System.out.println("Ingrese su direccion: ");
        setDirection(in.nextLine());
        System.out.println("Ingrese cuantos libros/revistas/articulos tiene en su posesion: ");
        setAmountbooks(in.nextInt());
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public int getIn() {
        return In;
    }

    public static void setIn(int in) {
        In = in;
    }

    public String getDirection() {
        return direction;
    }

    public static void setDirection(String direction) {
        User.direction = direction;
    }

    public int getAmountbooks() {
        return amountbooks;
    }

    public static void setAmountbooks(int amountbooks) {
        User.amountbooks = amountbooks;
    }
}
