package com.collection.app;

import java.util.ArrayList;
import java.util.HashSet;

public class Service {
    static ArrayList<Object> s = new ArrayList<>();
    public static ArrayList<Object> printCollectionList(){
        // Adding an integer to the ArrayList
        s.add(5);

        // Adding other types of objects to the ArrayList
        s.add("Hello");
        s.add(3.14);
        s.add(true);

        // Insert an element at a specific index
        s.add(4, "Mango");  // Insert "Mango" at index 1

        // Get the element at a specific index
        String secondElement = String.valueOf(s.get(1));

        HashSet<Object> uniqueItems = new HashSet<>();
        for (Object temp : s) {
            if (uniqueItems.add(temp)) {
                System.out.println("Value for this index is: " + temp);

            }
        }
        System.out.println("second element in the list which is the Value for  index 1 is: " + secondElement);


        return s;
    }


}
