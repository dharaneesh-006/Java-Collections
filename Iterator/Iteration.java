package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Sample Iterator

public class Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer>it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x == 10) {
                it.remove(); 
            }
        }
    }
}
