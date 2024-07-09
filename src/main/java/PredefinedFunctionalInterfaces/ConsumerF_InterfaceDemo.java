package PredefinedFunctionalInterfaces;

import java.util.function.Consumer;

/*class ConsumerImpl implements Consumer<String>{       // Consumer<T> Accepts a single argument and does not return any result.
    @Override
    public void accept(String s) {
        System.out.println("Hello world and my name is: " + s);
    }
}*/
public class ConsumerF_InterfaceDemo{
    public static void main(String[] args) {


/*
        ConsumerImpl consumer  =  new ConsumerImpl();
        consumer.accept("Aditya Gupta");
*/

        Consumer<String> consumer = (input) -> { System.out.println("hello world and my name is : " + input ); };
        consumer.accept("Aditya Guptaa");

    }
}
