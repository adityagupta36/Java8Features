package PredefinedFunctionalInterfaces;

import java.util.function.Function;

//        Traditional
//Function<T,R> ==> predefined Functional interface having [ R apply(T t) method ]
/*class FunctionImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }

}*/
public class FunctionF_InterfaceDemo {
    public static void main(String[] args) {

//        Traditional
 /*       Function<String,Integer> function = new FunctionImpl();
        Integer result  = function.apply("Aditya");
        System.out.println(result);*/



        //Above all the commented lines of code are not required, only below 2 lines of code required...

       Function<String,Integer> function =  (String s) -> { return s.length(); };
        System.out.println(function.apply("AdityaGupta"));
    }
}
