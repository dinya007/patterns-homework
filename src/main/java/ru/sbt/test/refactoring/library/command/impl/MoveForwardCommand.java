package ru.sbt.test.refactoring.library.command.impl;

import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.exception.UnitInDitchException;
import ru.sbt.test.refactoring.library.location.Location;
import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * Created by denis on 17/11/15.
 */
public class MoveForwardCommand extends Command {

    @Override
    public void execute(Unit unit) {
        Location location = unit.getLocation();
        location.setPosition(location.getOrientation().moveForwards(location.getPosition()));
        if (location.getPosition().getX() > unit.getField().getX() || location.getPosition().getX() < 0 || location.getPosition().getY() > unit.getField().getY() || location.getPosition().getY() < 0) {
            throw new UnitInDitchException();
        }
    }

}
