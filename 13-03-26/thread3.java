public class thread3 implements Runnable {
    public void run() {
        System.out.println("the thread is now running...");
    }

    public static void main(String[] args) {
        Runnable r1 = new thread3();
        Thread t1 = new Thread(r1, "the new thread");

        t1.start();

        System.out.println("the current thread is : " + t1.getName());
    }
}
