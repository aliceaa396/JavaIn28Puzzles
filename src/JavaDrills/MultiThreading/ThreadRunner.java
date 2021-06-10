package JavaDrills.MultiThreading;


class Task1 extends Thread {
    public void run() {
        System.out.println("\nTask1 Started");

        for(int i = 100; i <= 199; i++){
            System.out.println(i + " ");
        }
        System.out.println("\n Task 1 Complete");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("\nTask2 Started");
        for(int i = 200; i <= 299; i++){
            System.out.println(i + " ");
        }
        System.out.println("\n Task 2 Complete");
    }
}

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nTask 1 Kicked Off");
        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start();

        System.out.println("\nTask 2 Kicked Off");
        Task2 task2 = new Task2();
        Thread  task2Thread = new Thread(task2);
        task2Thread.start();

        //Ensures that task1 and task2 complete before 3 is started
        task1.join();
        task2Thread.join();

        System.out.println("\nTask 3 Kicked Off");
        for(int i = 300; i <= 399;i++){
            System.out.println(i + " ");
        }
        System.out.println("\nTask 3 Complete");

        System.out.println("\nMain Complete");
    }
}
