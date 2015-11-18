package ru.sbt.test.refactoring.library.location;

/**
 * Created by denis on 17/11/15.
 */
public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        this.x = position.getX();
        this.y = position.getY();
    }

    public int getX() {
        return x;
    }

    public Position setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Position setY(int y) {
        this.y = y;
        return this;
    }

    public Position incrementX(){
        this.x = ++this.x;
        return this;
    }

    public Position incrementY(){
        this.y = ++this.y;
        return this;
    }

    public Position decrementX(){
        this.x = --this.x;
        return this;
    }

    public Position decrementY(){
        this.y = --this.y;
        return this;
    }

}
