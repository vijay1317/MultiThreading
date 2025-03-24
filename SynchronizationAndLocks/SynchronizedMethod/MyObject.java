package SynchronizationAndLocks.SynchronizedMethod;

public class MyObject {
    public synchronized void m1(String name){
        try{
            System.out.println("Thread "+name+" .m1(): starting");
            Thread.sleep(3000);
            System.out.println("Thread "+name+" .m1(): ending");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void m2(String name){
        try{
            System.out.println("Thread "+name+" .m2(): starting");
            Thread.sleep(3000);
            System.out.println("Thread "+name+" .m2(): ending");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
