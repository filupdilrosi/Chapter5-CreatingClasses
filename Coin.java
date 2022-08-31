package Chapters5BuildingClasses.coinEncapsulation;

public class Coin {
    private final int HEADS = 0;//tails is 1
    private int face; //current side showing

    public Coin()
    {
        flip();
    }
    public void flip()
    {
        face = (int) (Math.random()*2);
    }
    //
    //Returns true if the current face is heads
    public boolean isHeads()
    {
        return (face==HEADS);
    }
    //
    //returns current face as a string
    public String toString()
    {
        return (face==HEADS) ? "Heads" : "Tails";
    }
}
