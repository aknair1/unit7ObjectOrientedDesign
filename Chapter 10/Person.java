import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Person implements Comparable
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    
    public int compareTo(Object obj)
    {
        Person other = (Person) obj;
        return other.name.compareTo(name);
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Printing this so because scanner sucks");
        ArrayList<Person> people = new ArrayList<Person>();
        for(int i = 0; i < 10; i++)
        {
            people.add(new Person(s.nextLine()));
        }
        Collections.sort(people);
         System.out.println(people.get(9).name);
        System.out.println(people.get(0).name);
    }
   
}
