package ru.sbt.test.refactoring.client.session;

/**
 * Created by denis on 18/11/15.
 */
public class GameSession {

    public void startSession() {
        SessionCommand.counter.set(0);
    }

    public int stopSession() {
        return SessionCommand.counter.intValue();
    }

}
