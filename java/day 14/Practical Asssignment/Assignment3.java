class Number {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class Chracter implements Runnable {
    Number n;

    public Chracter(Number n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Thread: " + i);
        }

        synchronized(n) {
            n.run(); 
        }
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Number n = new Number();
        Chracter c = new Chracter(n);
        Thread t = new Thread(c);
        t.start();
    }
}

