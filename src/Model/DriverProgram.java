package Model;

import Functions.Choosething;
import Functions.User;

public class DriverProgram {
    public static User person;
    public static Choosething choose;
    public static void main(String[] args) {
        person= Controller.newuser();
        choose= Controller.newchoose();
    }
}
