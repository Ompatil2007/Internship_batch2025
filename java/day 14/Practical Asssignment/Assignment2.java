class Assignment2 implements Runnable{
    public void run() {
        try {
            for (int i = 1; i <=5; i++) {
                System.out.println("Hello from Thread:"+i);
                Thread.sleep(1000); 
            }
        } catch (Exception e) {
            System.out.println(e); 
        }
    }

    public static void main(String args[]) {
        Assignment2 a = new Assignment2();
        Thread t=new Thread(a);
        t.start(); 
        }
}
