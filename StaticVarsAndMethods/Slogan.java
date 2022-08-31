package Chapters5BuildingClasses.StaticVarEx;
//represents a single slogan/motto
public class Slogan {
    private String phrase;
    private static int count = 0;
    //Constructor sets up the slogan and increments the number of instances created
    public Slogan(String str)
    {
        phrase = str;
        count++;
    }
    //Return slogan as a string
    public String toString()
    {
        return phrase;
    }
    //Return the number of instances of this class that have been created
    public static int getCount()
    {
        return count;
    }
}
