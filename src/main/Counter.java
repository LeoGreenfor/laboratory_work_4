package main;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter extends Thread{
    private int c = 0;
    Lock lock = new ReentrantLock();

    public void increment(){
        int a;
        try
        {
            lock.tryLock(10, TimeUnit.SECONDS);
            sleep(150);
            a = c;
            a++;
            c = a;
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
    public void decrement(){
        int a;
        try
        {
            lock.tryLock(10, TimeUnit.SECONDS);
            sleep(100);
            a = c;
            a--;
            c = a;
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
    public int value() {
        return c;
    }
}
