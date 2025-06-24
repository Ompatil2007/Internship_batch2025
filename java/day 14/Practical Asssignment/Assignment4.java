class Counter{
     int count=0;
    public synchronized void increment(){
        count++;

    }
    public int getCount(){
        return count;
    }
}
class CounterThread extends Thread{
    Counter c;

    CounterThread(Counter c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}
public class Assignment4 {
    public static void main(String[] args) {
        Counter c1=new Counter();
        CounterThread t1=new CounterThread(c1);
        CounterThread t2=new CounterThread(c1);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Final count:"+c1.count);
        }
        }

