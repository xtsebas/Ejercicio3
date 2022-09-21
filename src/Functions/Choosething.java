package Functions;

import Library.Article;
import Library.Book;
import Library.Magazine;
import Model.Controller;

import java.util.Scanner;

public class Choosething {
    private  int Id;
    private String title;
    private String topic;
    private int amount;
    private String condition;
    private int thing;
    private String autor;
    private static String editorial;
    private static int year;
    private static int number;
    private static String referee;
    static Scanner in= new Scanner(System.in);

    public Choosething(){
        System.out.println("//////////////////////////////////////");
        System.out.println("Ingrese Id: ");
        setId(in.nextInt());
        in.nextLine();
        System.out.println("Ingrese el titulo: ");
        setTitle(in.nextLine());
        System.out.println("Ingrese la materia: ");
        setTopic(in.nextLine());
        System.out.println("Ingrese la cantidad que esta ingresando a la bibloteca");
        setAmount(in.nextInt());
        if (getAmount()==0){
            setCondition("agotado");
        }else {
            setCondition("Disponible");
        }
        in.nextLine();
        System.out.println("Ingrese si es \n1. Libro \n2. Revista \n3. Articulo");
        setThing(in.nextInt());
        in.nextLine();
        if (getThing()==1){
            newbook();
            autor=Book.getAutor();
            editorial=Book.getEditorial();
        } else if (getThing()==2) {
            newmagazine();
            year=Magazine.getYear();
            number=Magazine.getNumber();
        } else if (getThing()==3) {
            newarticle();
            referee=Article.getReferee();
        } else if (getThing()!=1 & getThing()!=2 & getThing()!=3) {
            System.out.println("SU eleccion no esta disponible en la bibloteca");
        }
    }

    public static Book newbook(){
        Book book= new Book();
        return book;
    }
    public static Magazine newmagazine(){
        Magazine magazine= new Magazine();
        return magazine;
    }

    public static Article newarticle(){
        Article article= new Article();
        return article;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getThing() {
        return thing;
    }

    public void setThing(int thing) {
        this.thing = thing;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
