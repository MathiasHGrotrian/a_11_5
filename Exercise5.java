package Chapter11;

import java.util.*;

public class Exercise5
{

    /*
    Write a method called sortAndRemoveDuplicates that accepts a list of integers
    as its parameter and rearranges the list’s elements into sorted ascending order,
    as well as removing all duplicate values from the list. For example,
    the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9]
    would become [–9, –5, 4, 7, 8, 11, 15, 27, 32] after a call to your method.
    Use a Set as part of your solution.
    */

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(27);
        list.add(7);
        list.add(11);
        list.add(-5);
        list.add(32);
        list.add(-9);
        list.add(-9);

        System.out.println("Original list: " + list);
        System.out.println("New list, sorted and no duplicates: " + sortAndRemoveDuplicates(list));
    }

    public static ArrayList<Integer> sortAndRemoveDuplicates(ArrayList<Integer> list)
    {

        Set<Integer> set = new HashSet<Integer>(list);  //makes a hashset with the first list, eliminating duplicates
        ArrayList<Integer> newList = new ArrayList<Integer>();  //creates a new arraylist

        newList.addAll(set);    //adds the hashset to the new list
        Collections.sort(newList);  //sort the newList

        return newList;
    }
}
