package InterfaceIntro;

import java.util.ArrayList;

public class ReadingList implements Readable {

    private ArrayList<Readable> readables;

    public ReadingList(){
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable){
        this.readables.add(readable);
    }

    public int toRead(){
        return this.readables.size();
    }

    public String read(){
        String read = "";

        for(Readable readable: this.readables){
            read = read + readable.read() + "\n";
        }

        //Once the reading list has been read, we clear it
        this.readables.clear();
        return read;
    }
}
