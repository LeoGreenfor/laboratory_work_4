package main;

public class FirstStream extends Thread {
    private final Counter counter;

    public FirstStream(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        //counter.decrement();
        counter.increment();

        System.out.println("First stream - " + counter.value());
    }
}
