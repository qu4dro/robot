package ru.orlovvv;

public class Main {

    public static void main(String[] args) {
        SmartRobot sr = new SmartRobot();
        sr.moveTo(-0, -3);
        sr.moveTo(5, 4);
        sr.moveTo(0, 3);
        sr.moveTo(0, 0);
        sr.moveTo(-3, -5);
        sr.moveTo(14, -2);
        sr.moveTo(0, -5);
        System.out.println("Сейчас я тут");
        System.out.println(sr.getX() + " " + sr.getY());
        sr.moveTo(0, -5);
        sr.moveTo(-19, 5);
        sr.moveTo(2, 3);
        sr.moveTo(-4, -4);
        sr.moveTo(-4, -4);
        sr.moveTo(5, -4);
        sr.moveTo(5, 4);
        sr.moveTo(0, 3);
        System.out.println("Сейчас я тут");
        System.out.println(sr.getX() + " " + sr.getY());
    }
}
