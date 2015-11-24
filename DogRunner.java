
/**
 * Write a description of class DogRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogRunner
{
   public static void main(){
       Dog sadie = new Dog();
       
       sadie.isBlind = true;
       sadie.isDeaf = true;
       sadie.name = "Sadie";
       sadie.legs = 4.0;
       sadie.size = 1;
       
       System.out.println(sadie.name);
       sadie.bark();
   }
}
