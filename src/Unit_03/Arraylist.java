package Unit_03;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            products.add(sc.next());
        }
        Iterator itr = products.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        Collections.sort(products);
        products.addLast("lichi");
        products.addFirst("apple");
        products.add(3,"papaya");
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());

}
}
