package Unit_03;

import java.util.*;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("First");
        dq.add("Zero");
        dq.add("Second");
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        System.out.println(dq);
    }
}