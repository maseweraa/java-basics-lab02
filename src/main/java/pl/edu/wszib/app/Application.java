package pl.edu.wszib.app;

import pl.edu.wszib.app.mypackage.MyClass2;

// importy
public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world");

        MyClass2 myClass = new MyClass2();
//        myClass.field2 = "Field2";
        myClass.field3 = "Field3";
        myClass.field4 = "Field4";
//        myClass.run2();
        myClass.run3();
        myClass.run4();

        myClass.run();
    }

}
