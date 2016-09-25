
import java.util.ArrayList;
import java.util.Collections;

public class TheGreatest {

    public static int greatest(ArrayList<Integer> list) {
            list.toArray();

            int greatest = Collections.max(list);
            
        
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
