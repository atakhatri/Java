public class thread2 implements Runnable {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        thread2 t1 = new thread2();
        Thread th1 = new Thread(t1);

        th1.start();
    }
}
