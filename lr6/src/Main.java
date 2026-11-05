public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        c.increment();

        c.decrement();
        c.decrement();

        System.out.println(c.getValue());
    }
}