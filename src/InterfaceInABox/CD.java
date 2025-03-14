package InterfaceInABox;

public class CD implements Packable{

    private String artist;
    private String album;
    private int year;
    private double weight;

    public CD(String artist, String album, int year){
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.weight = 0.1;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return String.format("%s: %s (%d)", this.artist, this.album, this.year);
    }
}
