
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    //declare instance variables
    public String name;
    public String breed;
    public int age;
    public double legs;
    public boolean isBlind;
    public boolean isDeaf;
    public int size;  // 1 = small, 2 = medium, 3 = large
    
    public void bark(){
        if(this.size == 1)
            System.out.println("yip yip");
        else if(this.size == 2)
            System.out.println("Woof Woof!");
        else
            System.out.println("ARF ARF!");
    }
    
    
}
