package ru.sbt.test.refactoring.library.location.orientation;

import ru.sbt.test.refactoring.library.location.Position;

/**
 * Created by denis on 17/11/15.
 */
public interface Orientation {

    Position moveForwards(Position position);

    Orientation turnClockwise();

}
