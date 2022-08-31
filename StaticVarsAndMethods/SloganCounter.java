package Chapters5BuildingClasses.StaticVarEx;
//Demonstrates the use of static modifier
public class SloganCounter {
    public static void main(String[] args) {
        Slogan obj;

        obj = new Slogan("first slogan");
        System.out.println(obj)     ;

        obj = new Slogan("2nd slogan");
        System.out.println(obj)       ;

        obj = new Slogan("3rd slogan");
        System.out.println(obj)      ;

        obj = new Slogan("4th slogan");
        System.out.println(obj)      ;

        obj = new Slogan("5th slogan");
        System.out.println(obj);

        System.out.println();
        System.out.println("Number of mottos created: " +Slogan.getCount());
    }
}
