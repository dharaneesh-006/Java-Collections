package List;

import java.util.ArrayList;

public class ArrayListDemo {

    static void printer(ArrayList<Integer> arr)
    {   
        if(arr.size() == 0 ){
            System.out.println("Array is empty...");
            return;
        }
        
        System.out.println("Array Start....");
        for(int i : arr)
        {
            System.out.println(i+" ");
        }
        System.out.println("Array End.... \n");
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(10);
        printer(arrlist);
        arrlist.add(20); //Add elements at the end.
        printer(arrlist);

        arrlist.add(1,30);
        printer(arrlist);
        arrlist.add(1,40); // Ad the new element my moving the existing element to right.
        printer(arrlist);

        System.out.println("Get()"+arrlist.get(3)); // returns the element at the index

        arrlist.set(3, 50); // replace the element at the given index
        printer(arrlist);

        arrlist.remove(2); //remove the element at the index;
        printer(arrlist);
        arrlist.remove(Integer.valueOf(10)); //removes the vale of 10
        printer(arrlist);

        System.out.println(arrlist.contains(10)); //Check whether the element present in array
        printer(arrlist);
        arrlist.add(10);
        arrlist.add(10);
        printer(arrlist);
        System.out.println(arrlist.indexOf(10));
        System.out.println(arrlist.lastIndexOf(10)); // Returns the index Positions


        //Arraylist Functions
        System.out.println(arrlist.size());
        System.err.println(arrlist.isEmpty());
        arrlist.clear(); // clears the array.
        printer(arrlist);


    }
}
