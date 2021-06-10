package JavaDrills.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    private int num;
    public Task(int num) {
        this.num = num;
    }
    public void run(){
        System.out.println("\nTask " + num + " Started");
        for(int i = num * 100; i <= num * 100 + 99; i++){
            System.out.println(i + " ");
        }
        System.out.println("\nTask " + num + " Done");
    }
}

public class ExecutorRunner {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        //Executor Service will only run one thread at a time

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));


        executorService.shutdown();
    }
}
