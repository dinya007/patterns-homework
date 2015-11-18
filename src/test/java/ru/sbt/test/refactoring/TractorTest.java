package ru.sbt.test.refactoring;

import junit.framework.TestCase;
import ru.sbt.test.refactoring.library.command.impl.MoveForwardCommand;
import ru.sbt.test.refactoring.library.command.impl.TurnClockwiseCommand;
import ru.sbt.test.refactoring.library.exception.UnitInDitchException;
import ru.sbt.test.refactoring.library.location.orientation.impl.EastOrientation;
import ru.sbt.test.refactoring.library.location.orientation.impl.NorthOrientation;
import ru.sbt.test.refactoring.library.location.orientation.impl.SouthOrientation;
import ru.sbt.test.refactoring.library.location.orientation.impl.WestOrientation;
import ru.sbt.test.refactoring.library.unit.Tractor;
import ru.sbt.test.refactoring.library.unit.Unit;

/**
 * @author Ben
 *
 */
public class TractorTest extends TestCase {

	public void testShouldMoveForward(){
		Unit tractor = new Tractor();
		tractor.executeCommand(new MoveForwardCommand());
		assertEquals(0, tractor.getPositionX());
		assertEquals(1, tractor.getPositionY());
	}

	public void testShouldTurn(){
		Unit tractor = new Tractor();
		tractor.executeCommand(new TurnClockwiseCommand());
		assertTrue(tractor.getOrientation() instanceof EastOrientation);
		tractor.executeCommand(new TurnClockwiseCommand());
		assertTrue(tractor.getOrientation() instanceof SouthOrientation);
		tractor.executeCommand(new TurnClockwiseCommand());
		assertTrue(tractor.getOrientation() instanceof WestOrientation);
		tractor.executeCommand(new TurnClockwiseCommand());
		assertTrue(tractor.getOrientation() instanceof NorthOrientation);
	}

	public void testShouldTurnAndMoveInTheRightDirection(){
		Unit tractor = new Tractor();
		tractor.executeCommand(new TurnClockwiseCommand());
		tractor.executeCommand(new MoveForwardCommand());
		assertEquals(1, tractor.getPositionX());
		assertEquals(0, tractor.getPositionY());
		tractor.executeCommand(new TurnClockwiseCommand());
		tractor.executeCommand(new MoveForwardCommand());
		assertEquals(1, tractor.getPositionX());
		assertEquals(-1, tractor.getPositionY());
		tractor.executeCommand(new TurnClockwiseCommand());
		tractor.executeCommand(new MoveForwardCommand());
		assertEquals(0, tractor.getPositionX());
		assertEquals(-1, tractor.getPositionY());
		tractor.executeCommand(new TurnClockwiseCommand());
		tractor.executeCommand(new MoveForwardCommand());
		assertEquals(0, tractor.getPositionX());
		assertEquals(0, tractor.getPositionY());		
	}
	
	public void testShouldThrowExceptionIfFallsOffPlateau(){
		Unit tractor = new Tractor();
		tractor.executeCommand(new MoveForwardCommand());
		tractor.executeCommand(new MoveForwardCommand());
		tractor.executeCommand(new MoveForwardCommand());
		tractor.executeCommand(new MoveForwardCommand());
		tractor.executeCommand(new MoveForwardCommand());
		try{
			tractor.executeCommand(new MoveForwardCommand());
			fail("Tractor was expected to fall off the plateau");
		}catch(UnitInDitchException expected){
		}
	}
}
