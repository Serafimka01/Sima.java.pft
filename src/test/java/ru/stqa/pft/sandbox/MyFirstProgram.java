package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("работает");
        hello("и так работает");

        Square s = new Square(5);
        System.out.println("чет циферки " + s.l + "=" + s.area());


        Rectangle r = new Rectangle(4, 6);
        System.out.println("с двумя умноженными переменными " + r.a + " и " + r.b + " = " + r.asd());
    }

    public static void hello(String smb) {
        System.out.println("Еба, " + smb + "!");
    }

}
