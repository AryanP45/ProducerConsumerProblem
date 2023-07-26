public class Factory {
    private
    int quantity;
    boolean flag = true;
    // if flag is true execute produce
    // if flag is false execute consume
    public synchronized void produce(int quantity){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.quantity = quantity;
        System.out.println("Produced : "+quantity);
        flag = false;
        notify();
    }
    public synchronized void consume(){
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed : "+quantity);
        flag = true;
        notify();
    }
}
