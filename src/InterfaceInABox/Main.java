package InterfaceInABox;

public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.booksAndCDs();
        main.addToBox();
        main.boxInBox();

    }

    public void boxInBox(){
        Box box = new Box(10);

        box.add(new Book("Author1", "Book 1", 2));
        box.add(new Book("Author2", "Book 2", 1));
        box.add(new Book("Author3", "Book 3", 0.5));

        box.add(new CD("Artist1", "Album 1", 1973));
        box.add(new CD("Artist2", "Album 2", 1975));
        box.add(new CD("Artist3", "Album 3", 2012));

        Box box2 = new Box(10);
        box2.add(box);

        //This box contains 1 box object, will not show how many contents are in the original box
        System.out.println(box2); //Box: 1, Total weight: 3.80 kg

    }

    public void addToBox(){
        Box box = new Box(10);

        box.add(new Book("Author1", "Book 1", 2));
        box.add(new Book("Author2", "Book 2", 1));
        box.add(new Book("Author3", "Book 3", 0.5));

        box.add(new CD("Artist1", "Album 1", 1973));
        box.add(new CD("Artist2", "Album 2", 1975));
        box.add(new CD("Artist3", "Album 3", 2012));

        System.out.println(box);
    }

    public void booksAndCDs(){
        Book book1 = new Book("Author1", "Book 1", 2);
        Book book2 = new Book("Author2", "Book 2", 1);
        Book book3 = new Book("Author3", "Book 3", 0.5);

        CD cd1 = new CD("Artist1", "Album 1", 1973);
        CD cd2 = new CD("Artist2", "Album 2", 1975);
        CD cd3 = new CD("Artist3", "Album 3", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
