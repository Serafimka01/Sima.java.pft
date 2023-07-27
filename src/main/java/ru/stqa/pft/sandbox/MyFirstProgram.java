package ru.stqa.pft.sandbox;


import org.testng.annotations.Test;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("работает");
        hello("и так работает");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.a + "=" + s.area());


        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String smb) {
        System.out.println("Еба, " + smb + "!");
    }

}
