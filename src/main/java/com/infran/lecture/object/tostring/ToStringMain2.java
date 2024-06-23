package com.infran.lecture.object.tostring;


import static com.infran.lecture.object.poly.ObjectPrinter.*;
import static com.infran.lecture.object.tostring.ObjectPrinter.print;

public class ToStringMain2 {

    public static void main(String[] args) {
        final Car car = new Car("Model Y");
        final Dog buddy = new Dog("Buddy", 3);
        final Dog carrot = new Dog("Carrot", 5);

        System.out.println("car = " + car);
        System.out.println("buddy = " + buddy);
        System.out.println("carrot = " + carrot);
        print(car);
        print(buddy);
        print(carrot);
        final String hex = Integer.toHexString(System.identityHashCode(buddy));
        System.out.println("hex = " + hex);

    }

}
