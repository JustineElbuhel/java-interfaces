package InterfaceInABox;

import java.util.Random;

public class Factory {

    public Factory(){
        //Note that there is no need to write an empty constructor without parameters if the class doesn't have other
        //constructors. In these cases Java automatically creates a default constructor for the class which is an
        // empty constructor without parameters.
    }

    public Packable produceNew(){
        Random ticket = new Random();
        int number = ticket.nextInt(4);

        if(number == 0){
            return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if (number == 1) {
            return new CD("Miley Cyrus", "Hannah Montana The Movie", 2009);
        } else if (number == 2) {
            return new Book("Robert Martin", "Clean Code", 1);
        } else if (number == 3) {
            return new Book("Kent Beck", "Test Driven Development", 0.7);
        } else {
            return new ChocolateBar();
        }
    }
}
