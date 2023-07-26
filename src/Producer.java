public class Producer extends Thread {
    Factory f;
    Producer(Factory f){
        this.f=f;
    }
    public void run(){
        int i=0;
            while(i<20){
                f.produce(i);
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                i++;
            }
    }
}
