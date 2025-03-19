package Implementation;

public class RunnableThreadExample implements Runnable{
    int count =0;
    @Override
    public void run() {

        System.out.println("runnable thread is running:");
        try{
            while(count <5){
                Thread.sleep(500);
                count++;
            }

        }catch (InterruptedException exc) {
            System.out.println("Runnable thread interrupted");
        }
        System.out.println("RunnableThread terminating");
    }
}
