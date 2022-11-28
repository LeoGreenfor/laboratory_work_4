package main;


public class SecondStream extends Thread {
    private final Counter counter;

    public SecondStream(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();

        System.out.println("Second stream - " + counter.value());

    }

}
