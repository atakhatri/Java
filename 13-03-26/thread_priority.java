class thread1 extends Thread {
    public void run() {
        System.out.println("thread priority.");
    }
}

public class thread_priority {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread1 t2 = new thread1();
        thread1 t3 = new thread1();

        System.out.println("default for t1 = " + t1.getPriority());
        System.out.println("default for t2 = " + t2.getPriority());
        System.out.println("default for t3 = " + t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(6);
        t3.setPriority(9);

        System.out.println("new priority for t1 = " + t1.getPriority());
        System.out.println("new priority for t2 = " + t2.getPriority());
        System.out.println("new priority for t3 = " + t3.getPriority());

        System.out.println("thread name = " + Thread.currentThread().getName());
        System.out.println("current thread default priority : " + Thread.currentThread().getPriority());
    }
}
