package Unit_02;

public class Thread_01 extends Thread {
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("Thread 1 "+i);
        }
    }
}
