package PredefinedFunctionalInterfaces;
/*class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method called");
    }
}*/

public class RunnableF_InterfaceDemo {
    public static void main(String[] args) {

//        Traditional way
        /*ThreadDemo t = new ThreadDemo();
        Thread td = new Thread(t);
        td.start();*/


//        Runnable-> is a Functional Interface(since contains only one abstract method)
         Runnable runnable = () -> System.out.println("run method called ...in lamda");
//        Thread thread = new Thread(runnable);
//        OR
         Thread thread = new Thread( () -> System.out.println("run method called ...in lamda") );
         thread.start();


    }

}
