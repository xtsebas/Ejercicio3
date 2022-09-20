package Functions;

import Library.Article;
import Library.Book;
import Library.Magazine;
import Model.Controller;

public class Choosething {
    private  int Id;
    private String title;
    private String topic;
    private int amount;
    private boolean condition;
    private int thing;
    private String autor;
    private static String editorial;
    private static int year;
    private static int number;
    private static String referee;

    public Choosething(){
        Id=0;
        title="";
        topic="";
        amount=0;
        condition=true;
        thing=1;
        if (thing==1){
            autor= Book.getAutor();
            editorial= Book.getEditorial();
        } else if (thing==2) {
            year= Magazine.getYear();
            number=Magazine.getNumber();
        } else if (thing==3) {
            referee= Article.getReferee();
        } else if (thing!=1 & thing!=2 & thing!=3) {
            System.out.println("SU eleccion no esta disponible en la bibloteca");
        }
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

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
