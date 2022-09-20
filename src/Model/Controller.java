package Model;

import Functions.Choosething;
import Functions.User;

import java.util.Scanner;

public class Controller {
    public static User newuser(){
        User user= new User();
        return user;
    }
    public static Choosething newchoose(){
        Choosething choosething= new Choosething();
        return choosething;
    }

    public static void showUser(User user){
        System.out.println("//////////////////////////////////////////////");
        System.out.println("Nombre: " + user.getName());
        System.out.println("Numero de identificacion: " + user.getIn());
        System.out.println("Direccion: " + user.getDirection());
        System.out.println("Cantidad de libros/revistas/articulos en prestamo: " + user.getAmountbooks());
        System.out.println("//////////////////////////////////////////////");
    }
}
