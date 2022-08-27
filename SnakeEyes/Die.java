package Chapters5BuildingClasses;

public class Die {
    private final int MAX = 6; //Max face values
    private int faceValue; //current showing value
    //Constructor sets the initial face value of this die
    public Die()
    {
        faceValue = 1;
    }
    //Computes a new face value and returns result
    public int roll()
    {
        faceValue= (int)(Math.random()*MAX)+1;
        return faceValue;
    }
    //face value mutator. The face value is not modified if the specified value is not valid
    public void setFaceValue(int value)
    {
        if (value<0 && value<=MAX)
            faceValue=value;
    }
    //Face value accessor
    public int getFaceValue()
    {
        return faceValue;
    }
    //Returns a string representation of this die
    public String toString()
    {
        String result = Integer.toString(faceValue);
        return result;
    }





}
