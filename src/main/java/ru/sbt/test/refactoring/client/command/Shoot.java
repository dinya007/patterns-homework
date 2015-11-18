package ru.sbt.test.refactoring.client.command;

import ru.sbt.test.refactoring.client.unit.Soldier;
import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * Created by denis on 18/11/15.
 */
public class Shoot extends Command {
    @Override
    public void execute(Unit unit) {
        if (unit instanceof Soldier) {
            Soldier soldier = (Soldier) unit;
            soldier.decrementAmmunition();
        }
    }
}
