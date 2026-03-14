public class join_thread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        join_thread j1 = new join_thread();
        join_thread j2 = new join_thread();
        join_thread j3 = new join_thread();

        j1.toString();
        try {
            j1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        j2.start();
        j3.start();
    }
}
