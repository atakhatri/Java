public class deamon_thread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("deamon thread is running");
        } else {
            System.out.println("user thread is running");
        }
    }

    public static void main(String[] args) {
        deamon_thread d1 = new deamon_thread();
        deamon_thread d2 = new deamon_thread();
        deamon_thread d3 = new deamon_thread();

        d1.setDaemon(true);
        d1.start();

        d2.start();
        d3.start();
    }
}
