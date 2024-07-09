package lamda_expressions;
interface Shape{         //Functional Interface
    void draw();
}
/*class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class draw() method");
    }
}*/
/*class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class draw() method");
    }
}*/
/*class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class draw() method");
    }
}*/
public class LamdaExample {
    public static void main(String[] args) {

//        Assigning Lamda expression as a value to a reference variable
//        storing lamda expression in Interface Class having one abstract method
        Shape rectangle =   () -> { System.out.println("Rectangle class draw() method"); };
        rectangle.draw();

/*        Shape square = () -> System.out.println("Square class draw() method");
        square.draw();*/

/*        Shape circle = () -> System.out.println("Circle class draw() method");
        circle.draw();*/



//        passing Lamda expression as a method parameter
        print(rectangle);

//        (Functional Programming) passing lamda exp as a method parameter ->  mostly done in this manner
        print( () -> System.out.println("Square class draw() method") );
        print( () -> System.out.println("Circle Class draw() method") );

    }



    public static void print(Shape shape){
        shape.draw();
    }
}