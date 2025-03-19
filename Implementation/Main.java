package Implementation;

public class Main {
    public static void main(String[] args) {
        /**
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread t = new Thread(instance);
        t.start();
        // wait until above thread counts to 5 (slowly)
        while(instance.count != 5){
            try{
                System.out.println("waiting for thread to count 5");
                t.sleep(250);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
         **/


        ThreadExample t = new ThreadExample();
        t.start();

        //wait until thread count 5

        while(t.count != 5){
          try{
              System.out.println( Thread.currentThread().getName()+ ": Waiting for thread to count 5 ");
              Thread.sleep(250);
          }catch (InterruptedException ex){
              System.out.println(ex.getStackTrace());
          }

        }

    }
}
