package TacoBoxes;

public interface TacoBox {
    int tacosRemaining(); //Returns number of tacos remaining in the box
    void eat(); //Reduces the number of tacos remaining by one. Taco count cannot be negative
}
