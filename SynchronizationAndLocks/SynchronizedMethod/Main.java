package SynchronizationAndLocks.SynchronizedMethod;

public class Main {
    public static void main(String[] args) {
        MyObject obj1 =  new MyObject();
        MyObject obj2 = new MyObject();

        MyClass t1 = new MyClass(obj1,"1");
        MyClass t2 = new MyClass(obj1,"2");
        t1.start();
        t2.start();
    }
}
