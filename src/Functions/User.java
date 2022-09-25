package Functions;

import java.util.Scanner;
/*
*clase user para crear usuarios
 */

public class User {
    /*
    *variables de la clase user
     */
    private static String name;
    private static int In;
    private static String direction;
    private static int amountbooks;
    Scanner in= new Scanner(System.in);
/*
*Constructor para un objeto de tipo User
 */
    public User(){
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Ingrese su nombre: ");
        setName(in.nextLine());
        System.out.println("Ingrese su numero de identificacion: ");
        setIn(in.nextInt());
        in.nextLine();
        System.out.println("Ingrese su direccion: ");
        setDirection(in.nextLine());
        System.out.println("Ingrese cuantos libros/revistas/articulos tiene en su posesion: ");
        setAmountbooks(in.nextInt());
    }
/*
*getters y setters de la clase User
 */
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

    public void setAmountbooks(int amountbooks) {
        User.amountbooks = amountbooks;
    }
}
