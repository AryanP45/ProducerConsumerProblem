public class Consumer extends Thread{
    Factory f;
    Consumer(Factory f){
        this.f = f;
    }

    public void run(){
        int i=0;
        while(i<20){
            f.consume();
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }

}
