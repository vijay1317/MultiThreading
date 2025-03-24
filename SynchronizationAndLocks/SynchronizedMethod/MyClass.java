package SynchronizationAndLocks.SynchronizedMethod;

public class MyClass extends Thread {

    private String name;
    private MyObject myObj;

    public MyClass(MyObject obj, String n){
        name = n;
        myObj = obj;
    }

    @Override
    public void run(){
       if(name.equals("1")){
           myObj.m1(name);
       }else{
           myObj.m2(name);
       }
    }

}
