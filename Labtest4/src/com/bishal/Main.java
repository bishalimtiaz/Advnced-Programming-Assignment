package com.bishal;

public class Main {

    public static void main(String[] args) {
        // Polymorphism
        Animal a1 = new Birds();
        Animal a2 = new Insects();
        Animal a3 = new Land();
        Animal a4 = new Water();
        Function f = new Function();
        //polymorphism:reference variable of Animal class calls move() of subclass
        //move() function displays how the animals move
        a1.canMove();
        a2.canMove();
        a3.canMove();
        a4.canMove();

        //variadic function is called
        f.doSomething(a1,a2,a3,a4);
    }
}
