package Model;

import Functions.Choosething;
import Functions.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;


public class Controller {
    public static int Id;
    static List<User> USER= new ArrayList<>();
    static List<Choosething> things= new ArrayList<>();
    static Scanner in= new Scanner(System.in);
    public static User newuser(){
        User user= new User();
        USER.add(user);

        return user;
    }
    public static Choosething newchoose(){
        Choosething choosething= new Choosething();
        things.add(choosething);
        return choosething;
    }

    public static void showUser(){
        for (int i = 0; i < USER.size(); i++) {
            System.out.println(USER.get(i));
        }
    }
    public static void searchID(){
        System.out.println("Ingrese Id: ");
        Id=in.nextInt();
        in.nextLine();
        for (Choosething choosething: things){
            if (choosething.getId()== Id){
                System.out.println("/////////////////////////////////////");
                if (choosething.getThing()==1){
                    System.out.println("El libro se ha encontrado");
                    System.out.println("Titulo: " + choosething.getTitle());
                    System.out.println("Id: " + choosething.getId());
                    System.out.println("Disponibilidad: "+ choosething.getCondition());
                } else if (choosething.getThing()==2) {
                    System.out.println("La revista se ha encontrado");
                    System.out.println("Titulo: " + choosething.getTitle());
                    System.out.println("Id: " + choosething.getId());
                    System.out.println("Disponibilidad: "+ choosething.getCondition());
                } else if (choosething.getThing()==3) {
                    System.out.println("El Articulo se ha encontrado");
                    System.out.println("Titulo: " + choosething.getTitle());
                    System.out.println("Id: " + choosething.getId());
                    System.out.println("Disponibilidad: "+ choosething.getCondition());
                }
                System.out.println("/////////////////////////////////////");
            }
        }
    }

    public static void lend(){
        for (Choosething choosething: things){
            System.out.println("//////////////////////////////////////////////");
            for (int i = 1; i < things.size(); i++) {
                System.out.println(i + ". " + choosething.getTitle() + ": " + choosething.getCondition());
            }
            System.out.println(choosething.getTitle() + ": " + choosething.getCondition());
            System.out.println("Cual desea?");

        }
    }
}
