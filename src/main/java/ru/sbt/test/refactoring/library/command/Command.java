package ru.sbt.test.refactoring.library.command;

import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * Created by denis on 17/11/15.
 */
public abstract class Command {

    public abstract void execute(Unit unit);

    public void addCommand(Command command){}

}
