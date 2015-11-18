package ru.sbt.test.refactoring.client;

import ru.sbt.test.refactoring.client.command.Shoot;
import ru.sbt.test.refactoring.client.session.GameSession;
import ru.sbt.test.refactoring.client.session.SessionCommand;
import ru.sbt.test.refactoring.client.unit.Soldier;
import ru.sbt.test.refactoring.library.command.Command;
import ru.sbt.test.refactoring.library.command.impl.CompoundCommand;
import ru.sbt.test.refactoring.library.command.impl.MoveForwardCommand;
import ru.sbt.test.refactoring.library.command.impl.TurnClockwiseCommand;
import ru.sbt.test.refactoring.library.unit.Tractor;
import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * Created by denis on 18/11/15.
 */
public class Main {

    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        GameSession gameSession = new GameSession();
        gameSession.startSession();

        Unit tractor = new Tractor();
        tractor.executeCommand(new SessionCommand(new MoveForwardCommand()));  //1
        tractor.executeCommand(new SessionCommand(new TurnClockwiseCommand())); //2

        Unit soldier = new Soldier();
        soldier.executeCommand(new SessionCommand(new MoveForwardCommand())); //3
        soldier.executeCommand(new SessionCommand(new Shoot()));    //4

        System.out.println("There was " + gameSession.stopSession() + " command executed.");

        gameSession.startSession();

        Command horseCommand = new SessionCommand(new CompoundCommand());
        horseCommand.addCommand(new MoveForwardCommand());
        horseCommand.addCommand(new MoveForwardCommand());
        horseCommand.addCommand(new MoveForwardCommand());
        horseCommand.addCommand(new TurnClockwiseCommand());
        horseCommand.addCommand(new MoveForwardCommand());

        soldier.executeCommand(horseCommand); //1
        tractor.executeCommand(horseCommand); //2

        System.out.println("There was " + gameSession.stopSession() + " command executed.");

    }

}
