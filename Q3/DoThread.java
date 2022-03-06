package Q3;

import java.util.ArrayList;
import java.util.List;

public class DoThread {
    public static void doIt(){
     Thread thread1=new Thread(new Calculate('+'));
     Thread thread2=new Thread(new Calculate('-'));
     Thread thread3=new Thread(new Calculate('*'));
     Thread thread4=new Thread(new Calculate('/'));
     List<Thread> threads=new ArrayList<>();
     threads.add(thread1);
     threads.add(thread2);
     threads.add(thread3);
     threads.add(thread4);

     for(var t:threads){
         t.start();
     }
     for(var t:threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
     }
        System.out.println("the main is finish");


    }
}
