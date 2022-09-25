package Model;

import Functions.Choosething;
import Functions.User;
import Library.Article;
import Library.Book;
import Library.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Controller {
    public static int id;
    public static String title;
    public static String topic;
    public static int amount;
    public static String condition;
    public static int thing;
    public static int Id;
    static List<User> USER= new ArrayList<>();
    static List<Choosething> things= new ArrayList<>();
    static List<Integer> Lend= new ArrayList<>();
    static Scanner in= new Scanner(System.in);
    private static int libro;
    private static int ID;
    private static int lend;

    public static User newuser(){
        User user= new User();
        USER.add(user);

        return user;
    }

    public static Book newBook(){
        Book book= new Book(id,title,topic,amount,thing);
        things.add(book);
        return book;
    }

    public static Magazine newMagazine(){
        Magazine magazine= new Magazine(id,title,topic,amount,thing);
        things.add(magazine);
        return magazine;
    }

    public static Article newArticle(){
        Article article= new Article(id, title, topic, amount, thing);
        things.add(article);
        return article;
    }

    public static void newChoose(){
        System.out.println("Cual es el Id: ");
        id=in.nextInt();
        in.nextLine();
        System.out.println("Cual es el titulo: ");
        title=in.nextLine();
        System.out.println("Cual materia es: ");
        topic=in.nextLine();
        System.out.println("Cuantos ingresara a la blibloteca: ");
        amount=in.nextInt();
        in.nextLine();
        System.out.println("De que tipo ingresa: \n1.Libro \n2.Revista \n3.Articulo");
        thing=in.nextInt();
        in.nextLine();
        if (thing==1){
            newBook();
        } else if (thing==2) {
            newMagazine();
        } else if (thing==3) {
            newArticle();
        }

    }

    public static void showUser(){
        for (User user: USER){
            System.out.println("/////////////////////////////////////////");
            System.out.println(user.getIn() + "\n" + user.getName() + "\n" + user.getAmountbooks());
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
                    System.out.println("Disponibilidad: "+ choosething.getCondition() + "\nCantidad: " + choosething.getAmount());
                } else if (choosething.getThing()==2) {
                    System.out.println("La revista se ha encontrado");
                    System.out.println("Titulo: " + choosething.getTitle());
                    System.out.println("Id: " + choosething.getId());
                    System.out.println("Disponibilidad: "+ choosething.getCondition() + "\nCantidad: " + choosething.getAmount());
                } else if (choosething.getThing()==3) {
                    System.out.println("El Articulo se ha encontrado");
                    System.out.println("Titulo: " + choosething.getTitle());
                    System.out.println("Id: " + choosething.getId());
                    System.out.println("Disponibilidad: "+ choosething.getCondition() + "\nCantidad: " + choosething.getAmount());
                }
                System.out.println("/////////////////////////////////////");
                break;
            } else {
                System.out.println("El libro no existe");
            }
        }
    }
    public static void show(){
        for (Choosething choosething: things){
            System.out.println("//////////////////////////////////////////////");
            System.out.println(choosething.getId() + "\n" + choosething.getTitle() + "\n" + choosething.getCondition());
        }
    }

    public static void lend(){
        show();
        System.out.println("Ingresar el Id de su eleccion");
        libro=in.nextInt();
        for (Choosething choosething: things){
            if (libro==choosething.getId()){
                if (choosething.getCondition() == "Disponible") {
                    System.out.println("Cual es tu Id?");
                    ID=in.nextInt();
                    for (User user: USER){
                        if (ID== user.getIn()){
                            if (user.getAmountbooks()<5){
                                user.setAmountbooks(user.getAmountbooks()+1);
                                System.out.println("Su libro ha sido prestado a la persona con Id " + user.getIn());
                                choosething.setAmount(choosething.getAmount()-1);
                                if (choosething.getAmount()== 0){
                                    choosething.setCondition("Agotado");
                                }
                                Lend.add(choosething.getId());
                                break;
                            } else if (user.getAmountbooks()==5) {
                                System.out.println("Usted ya esta en el limite de prestamos");
                                break;
                            }
                        } else {
                            System.out.println("Su usario no existe, debe crearlo para poder prestar un objeto de la bibloteca");
                            break;
                        }
                    }
                } else if (choosething.getCondition()=="Agotado") {
                    System.out.println("La eleccion no esta disponible en estos momentos");
                    break;
                }
            } else {
                System.out.println("El libro no existe en la bibloteca");
            }
        }
    }

    public static void Return(){
        System.out.println("Cual es su Id: ");
        ID=in.nextInt();
        for (User user: USER){
            if (ID==user.getIn()){
                if (user.getAmountbooks()>0){
                    System.out.println("Ingrese el Id del libro que desea regresar: ");
                    libro=in.nextInt();
                    for (Choosething choosething: things){
                        if (libro==choosething.getId()){
                            for (int i = 0; i < Lend.size(); i++) {
                                if (libro== Lend.get(i)){
                                    choosething.setAmount(choosething.getAmount()+1);
                                    if (choosething.getCondition()=="Agotado"){
                                        choosething.setCondition("Disponible");
                                    }
                                    System.out.println("El libro se ha devuelto con exito");
                                    break;
                                }else {
                                    System.out.println("El libro no se ha prestado, intentelo de nuevo");
                                }
                            }
                        } else {
                            System.out.println("El libro no existe dentro de la bibloteca");
                        }
                    }
                } else {
                    System.out.println("Usted no ha prestado ningun libro, intentelo mas tarde");
                }
            }
        }
    }

}
