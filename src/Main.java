public class Main {
    public static void main(String[] args) {
        Factory f = new Factory();
        Producer p = new Producer(f);
        Consumer c = new Consumer(f);

        p.start();
        c.start();
    }
}