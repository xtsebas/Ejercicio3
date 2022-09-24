package Functions;

import Library.Article;
import Library.Book;
import Library.Magazine;
import Model.Controller;

import java.util.Scanner;

public class Choosething {
    protected int Id;
    protected String title;
    protected String topic;
    protected int amount;
    protected String condition;
    protected int thing;

    public Choosething (int Id, String title, String topic, int amount, int thing){
        this.Id=Id;
        this.title=title;
        this.topic=topic;
        this.amount=amount;
        if (getAmount()==0){
            setCondition("Agotado");
        }else {
            setCondition("Disponible");
        }
        this.thing=thing;
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
