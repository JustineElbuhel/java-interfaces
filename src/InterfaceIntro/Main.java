package InterfaceIntro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        TextMessage message = new TextMessage("Homie", "It's going great!");
        System.out.println(message.read());

        ArrayList<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("private number", " I hid the body"));

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic");
        pages.add("Always program a small part initially that solves a part of the problem");
        pages.add("Practice makes the master. Try out different things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming", pages);

        int page = 0;
        while(page < book.pages()){
            System.out.println(book.read());
            page++;
        }

        //The type of the Ebook class tht implements the Readable interface is nook Ebook
        //and Readable, likewise with TextMessage objects
        TextMessage text = new TextMessage("Sister", "I got us concert tickets!");
        Readable readable = new TextMessage("Brother", "Wanna get some food?");

        //Because an interface can be used as a tupe, it is possible to create a list that contains objects of the
        //interface's type
        ArrayList<Readable> readingList = new ArrayList<>();
        readingList.add(new TextMessage("Bestie", "1"));
        readingList.add(new TextMessage("Bestie", "2"));
        readingList.add(new TextMessage("Bestie", "3"));
        readingList.add(new TextMessage("Bestie", "4"));

        ArrayList<String> pages2 = new ArrayList<>();
        pages.add("A method can call itself");

        readingList.add(new Ebook("An introduction to Recursion.", pages));

        for(Readable read : readingList){
            System.out.println(read.read());
        }

        System.out.println("======================");
        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);


        System.out.println("--------------------------------");
        ReadingList gabysList = new ReadingList();
        int i = 0;
        while(i < 100){
            gabysList.add(new TextMessage("Gaby", "Have you written the test yet?"));
            i++;
        }

        System.out.println("Gaby's to-read: " + gabysList.toRead());
        System.out.println("Delegating the reading list to Steph");

        ReadingList stephsList = new ReadingList();
        stephsList.add(gabysList);
        stephsList.read();

        System.out.println();
        System.out.println("Gaby's to-read: " + gabysList.toRead());
    }
}
