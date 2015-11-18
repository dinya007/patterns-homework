package ru.sbt.test.refactoring.library.location.orientation.impl;

import ru.sbt.test.refactoring.library.location.Position;
import ru.sbt.test.refactoring.library.location.orientation.Orientation;

/**
 * Created by denis on 17/11/15.
 */
public class NorthOrientation implements Orientation {

    public Position moveForwards(Position position) {
        return position.incrementY();
    }

    public Orientation turnClockwise() {
        return new EastOrientation();
    }

}
