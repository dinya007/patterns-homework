package ru.sbt.test.refactoring.client.unit;

import ru.sbt.test.refactoring.client.exception.AmmunitionExpiredException;
import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * Created by denis on 18/11/15.
 */
public class Soldier extends Unit {

    public static final int MAX_AMMUNITION = 30;

    private int ammunition = MAX_AMMUNITION;

    public void reload(){
        this.ammunition = MAX_AMMUNITION;
    }

    public void decrementAmmunition() {
        if (ammunition == 0) throw new AmmunitionExpiredException();
        this.ammunition = --ammunition;
    }

}
