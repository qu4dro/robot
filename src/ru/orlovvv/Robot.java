package ru.orlovvv;

public class Robot {

    private int x, y;
    private Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void turnRight() {
        switch (dir) {
            case RIGHT:
                dir = Direction.DOWN;
                printTurn(dir);
                break;
            case LEFT:
                dir = Direction.UP;
                printTurn(dir);
                break;
            case DOWN:
                dir = Direction.LEFT;
                printTurn(dir);
                break;
            case UP:
                dir = Direction.RIGHT;
                printTurn(dir);
                break;
        }
    }

    public void turnLeft() {
        switch (dir) {
            case RIGHT:
                dir = Direction.UP;
                printTurn(dir);
                break;
            case LEFT:
                dir = Direction.DOWN;
                printTurn(dir);
                break;
            case DOWN:
                dir = Direction.RIGHT;
                printTurn(dir);
                break;
            case UP:
                dir = Direction.LEFT;
                printTurn(dir);
                break;
        }
    }

    public void stepForward() {
        switch (getDir()) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDir() {
        return dir;
    }

    private void printTurn(Direction dir) {
        System.out.printf("поворот %s \n", dir);
    }
}

