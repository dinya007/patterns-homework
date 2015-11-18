package ru.sbt.test.refactoring.library.location;


import ru.sbt.test.refactoring.library.location.orientation.Orientation;
import ru.sbt.test.refactoring.library.location.orientation.impl.NorthOrientation;

/**
 * Created by denis on 17/11/15.
 */

public class Location {

    private Orientation orientation;
    private Position position;

    public Location() {
        this.orientation = new NorthOrientation();
        this.position = new Position(0,0);
    }

    public Location(Orientation orientation, Position position) {
        this.orientation = orientation;
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
