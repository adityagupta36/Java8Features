package FunctionalInterface;
@FunctionalInterface
public interface MyFunctionalInterface {

    void print(String message);                               //exactly one abstract method


    default void m1(){                                        //can have multiple default method
        System.out.println("default method");
    }

    static void m2(){                                         //can have multiple static method
        System.out.println("static method");
    }

}
