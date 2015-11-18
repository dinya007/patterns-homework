package ru.sbt.test.refactoring.client.session;

import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.unit.Unit;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by denis on 18/11/15.
 */
public class SessionCommand extends Command {

    public static final AtomicInteger counter = new AtomicInteger(0);
    private final Command command;

    public SessionCommand(Command command) {
        this.command = command;
    }

    @Override
    public void execute(Unit unit) {
        counter.incrementAndGet();
        command.execute(unit);
    }

}
