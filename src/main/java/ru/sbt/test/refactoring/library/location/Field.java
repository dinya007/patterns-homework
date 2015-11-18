package ru.sbt.test.refactoring.library.location;

/**
 * Created by denis on 17/11/15.
 */
public class Field {

    private final int x;

    private final int y;

    public Field() {
        this.x = 5;
        this.y = 5;
    }

    public Field(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
