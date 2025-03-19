package Implementation;

public class ThreadExample extends Thread{
    int count =0;

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ ": Thread starting...");

        try{
            while(count<5){
                System.out.println(Thread.currentThread().getName()+": Thread counted "+count);
                Thread.sleep(500);
                count++;
            }
        }catch (InterruptedException ex){
            System.out.println(ex.getStackTrace());
        }
        System.out.println(Thread.currentThread().getName()+"Thread terminated");
    }
}
