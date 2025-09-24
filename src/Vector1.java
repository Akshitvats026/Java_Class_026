
import java.sql.SQLOutput;
import java.util.Vector;

public class Vector1
{
    public static void main(String[] args) {
        Vector<String> vt = new Vector<>();
        vt.add("First");
        vt.add("Second");
        vt.add("First");
        vt.add("Second");
        vt.add("First");

        vt.add(2,"Fourth");

        System.out.println(vt.capacity());
        System.out.println(vt.size());
        System.out.println(vt.remove(2));
        System.out.println(vt.remove("first"));
        System.out.println(vt);
    }
}