public class sync_thread {
    public static void main(String[] args) {
        table obj = new table();
        syncThread1 tb1 = new syncThread1(obj);
        syncThread2 tb2 = new syncThread2(obj);

        tb1.start();
        tb2.start();
    }
}

class table {
    synchronized void printTable(int num) {
        System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
            try {
                if (i == 10) {
                    System.out.println();
                }
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class syncThread1 extends Thread {
    table tb;

    syncThread1(table t) {
        tb = t;
    }

    public void run() {
        tb.printTable(4);
    }
}

class syncThread2 extends Thread {
    table th;

    syncThread2(table t) {
        th = t;
    }

    public void run() {
        th.printTable(5);
    }
}
