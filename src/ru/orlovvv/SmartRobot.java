package ru.orlovvv;

public class SmartRobot extends Robot {

    public SmartRobot() {
        super(0, 0, Direction.UP);
    }

    public void moveTo(final int toX, final int toY) {

        switch (getDir()) {
            case UP:
                if (toX >= getX()) {
                    turnRight();
                } else {
                    turnLeft();
                }
                break;
            case DOWN:
                if (toX >= getX()) {
                    turnLeft();
                } else {
                    turnRight();
                }
                break;
            case RIGHT:
                if (toX >= getX()) {
                    break;
                } else {
                    turnLeft();
                    turnLeft();
                }
                break;
            case LEFT:
                if (toX >= getX()) {
                    turnRight();
                    turnRight();
                } else {
                    break;
                }
                break;
        }


        while (getX() != toX) {
            System.out.println("Иду по X " + getX());
            stepForward();

        }
        if (getDir() == Direction.LEFT) {
            if (toY > getY()) {
                turnRight();
            } else {
                turnLeft();
            }
            while (getY() != toY) {
                System.out.println("Иду по Y " + getY());
                stepForward();
            }
        }

        if (getDir() == Direction.RIGHT) {
            if (toY < getY()) {
                turnRight();
            } else {
                turnLeft();
            }
            while (getY() != toY) {
                System.out.println("Иду по Y " + getY());
                stepForward();

            }
        }


        System.out.println("Я пришел в пункт назначения " + toX + " " + toY);

    }
//TODO класс робот с конструкторами, методами get и turnLeft, turnRight, stepForward
//TODO реализовать наследника с функцией moveTo перемещающей робота из
//TODO текущего положения в заданную точку используя функции
}

