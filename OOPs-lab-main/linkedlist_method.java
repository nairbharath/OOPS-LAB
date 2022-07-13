import java.util.*;
class linkedlist_method
{
    public static void main(String arg[])
    {
        System.out.print(" \n\n\t\t LINKED LIST METHODS ");
        System.out.println("\n\t============================================");
        LinkedList<Integer> lst = new LinkedList<Integer>();
        LinkedList<Integer> lst1 = new LinkedList<Integer>();
        
        System.out.println("\n\t 1. ADD");
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst1.addAll(lst);
        System.out.println("\n\t\t first list is = "+lst);
        System.out.println("\n\t\t second list is = "+lst1);

        System.out.println("\n\t 2. REMOVE");
        System.out.println("\n\t\t removing element = " +lst.remove(0));
        System.out.println("\n\t\t after removing the first element = "+lst);

        System.out.println("\n\t 3. UPDATE");
        System.out.println("\n\t\t before updating = "+lst);
        System.out.println("\n\t\t updating element= "+lst.set(0,400));
        System.out.println("\n\t\t after updating = "+lst);

        System.out.println("\n\t 4. GETLAST");
        System.out.println("\n\t\tlast item is = "+ lst.getLast());

        System.out.println("\n\t 5. add FIRST and LAST");
        lst.addFirst(1000);
        lst.addLast(3000);
        System.out.println("\n\t\t new list is = " +lst);

        System.out.println("\n\t 6. REMOVE FIRST");
        System.out.println("\n\t\t removing element = " +lst.removeFirst());
        System.out.println("\n\t\t after removing first element = " +lst);

        System.out.println("\n\t 7.CLEAR");
        lst.clear();
        System.out.println("\n\t\t after clearing  = "+lst);
    }
}