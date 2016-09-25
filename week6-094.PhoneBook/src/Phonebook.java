
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    public void add (String name, String number) {
       Person person = new Person (name, number);
       list.add(person);
    }
    
    public void printAll () {
        for (Person persons: list)
            System.out.println(persons);
    }
    
    public String searchNumber (String name) {
        for (Person persons: list) 
            if (persons.getName().equals(name))
                return (persons.getNumber());
        return "number not known";
    }
}
