package ru.sbt.test.refactoring.library.unit;

import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.location.Field;
import ru.sbt.test.refactoring.library.location.Location;
import ru.sbt.test.refactoring.library.location.orientation.Orientation;

/**
 * Created by denis on 17/11/15.
 */
public abstract class Unit {



    private final Location location;
    private final Field field;

    public Unit() {
        this.location = new Location();
        this.field = new Field();
    }

    public Unit(Location location) {
        this.location = location;
        this.field = new Field();
    }

    public Unit(Field field) {
        this.location = new Location();
        this.field = field;

    }

    public Unit(Location location, Field field) {
        this.location = location;
        this.field = field;
    }

    public final void executeCommand(Command command) {
        command.execute(this);
    }

    public int getPositionX() {
        return this.location.getPosition().getX();
    }

    public int getPositionY() {
        return this.location.getPosition().getY();
    }

    public Orientation getOrientation() {
        return this.location.getOrientation();
    }

    public Location getLocation() {
        return location;
    }

    public Field getField() {
        return field;
    }

}
