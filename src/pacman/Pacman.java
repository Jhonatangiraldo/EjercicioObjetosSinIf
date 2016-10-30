/*
 * Developed by 10Pines SRL
 * License: 
 * This work is licensed under the 
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/ 
 * or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, 
 * California, 94041, USA.
 *  
 */
package pacman;

public class Pacman extends Actor {

	public Pacman(int x, int y) {
		super(x, y);
	}

	@Override
	public Point position() {
		return this.position;
	}

	@Override
	public Point nextPositionGhostHouseDoorType(Actor anActor, Point aMovement) {
		return anActor.position;
	}

	@Override
	public Point nextPositionLeftTransporterType(Actor anActor, Point aMovement) {
		return anActor.position = new Point(10,4);
	}

	@Override
	public Point nextPositionSpaceType(Actor anActor, Point aMovement) {
		return anActor.position.plus(aMovement).plus(aMovement);
	}

	@Override
	public Point nextPositionWallType(Actor anActor, Point aMovement) {
		return anActor.position;
	}
}
