package InterfaceInABox;

public class Book implements Packable{

    private String author;
    private String title;
    private double weight;

    public Book(String author, String title, double weight){
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.author, this.title);
    }
}
