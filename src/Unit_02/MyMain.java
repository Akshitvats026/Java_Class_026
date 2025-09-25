package Unit_02;

public class MyMain {
    public static void main(String[] args) {
        Thread_01 th1 = new Thread_01();
        Thread_02 th2 = new Thread_02();

        System.out.println(th1.getPriority());
        th1.setPriority(10);
        System.out.println(th1.getPriority());
        System.out.println(th1.getName());
        th1.setName("My Thread 1");
        System.out.println(th1.getName());

        th1.start();
        th2.start();
    }
}
