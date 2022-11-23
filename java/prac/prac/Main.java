package prac;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final short a = 5;
        final short b = 10;
        short l = a + b;
    }
}

class Person {
    private int a = 5;

    Person() {
        this.a = 10;    
    }

    int getA() {
        return this.a;
    }
}

class Student extends Person {

}