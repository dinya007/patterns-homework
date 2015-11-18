package ru.sbt.test.refactoring.library.unit;

import ru.sbt.test.refactoring.library.location.Location;
import ru.sbt.test.refactoring.library.location.Position;
import ru.sbt.test.refactoring.library.location.orientation.impl.NorthOrientation;

public class Tractor extends Unit {

    public Tractor() {
        super();
    }

    public Tractor(Position position) {
        super(new Location(new NorthOrientation(), position));
    }

}
