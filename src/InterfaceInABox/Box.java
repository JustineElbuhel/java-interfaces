package InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> inBox;
    private double capacity;


    public Box(double capacity){
        this.inBox = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable packable){
        if (packable.weight() + this.weight() <= this.capacity) {
            inBox.add(packable);
        }
    }

    public double weight(){
        if(inBox.isEmpty()){
            return 0;
        }

        double sum = 0;
        for(Packable packed : inBox){
            sum = sum + packed.weight();
        }
        return sum;
    }


    @Override
    public String toString(){
        return String.format("Box: %d, Total weight: %.2f kg", inBox.size(), this.weight());
    }

}
