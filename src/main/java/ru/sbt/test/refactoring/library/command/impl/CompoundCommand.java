package ru.sbt.test.refactoring.library.command.impl;

import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.unit.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denis on 17/11/15.
 */
public class CompoundCommand extends Command {

    private final List<Command> commandList;

    public CompoundCommand() {
        this.commandList = new ArrayList<>();
    }

    @Override
    public void execute(Unit unit) {
        commandList.forEach(command -> command.execute(unit));
    }

    @Override
    public void addCommand(Command command) {
        this.commandList.add(command);
    }

}
