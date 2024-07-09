package lamda_expressions;
interface Addable{
    int addition(int a , int b);
}
/*class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}*/
public class LamdaParameters {
    public static void main(String[] args) {

//        Traditional way
/*        Addable ad = new AddableImpl();
        System.out.println(ad.addition(1, 2));*/



//        Lamda exp having single statements
//        Addable addable = (int a, int b) ->  (a+b);
//        Addable addable = ( a,  b) ->  (a+b);
//        int result = addable.addition(10, 20);
//        System.out.println(result);


//        lamda exp having multiple statements
         Addable add  = (a,b) -> {int c = a+b; return c;};
         int result = add.addition(11,22);
        System.out.println(result);


    }
}
