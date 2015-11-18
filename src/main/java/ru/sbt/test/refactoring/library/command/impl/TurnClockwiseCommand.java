package ru.sbt.test.refactoring.library.command.impl;

import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * Created by denis on 17/11/15.
 */
public class TurnClockwiseCommand extends Command {

    @Override
    public void execute(Unit unit) {
        unit.getLocation().setOrientation(unit.getLocation().getOrientation().turnClockwise());
    }

}
