package mobileelement;

import entity.Collisions;
import entity.Entity;
import motionlesselement.OilPlayer1;
import motionlesselement.OilPlayer2;

/**
 * The Class MobileElements
 * 
 * @author Vincent Jacques
 */

public class MobileElement extends Entity {

	protected boolean StatePlayer1;
	protected boolean StatePlayer2;

	public MobileElement(int x, int y) {
		super(x, y);
	}

	public void movePlayer1(int x, int y) {
		final int Xpos = this.getPosition().getX();
		final int Ypos = this.getPosition().getY();
		final Entity[][] loadMap = this.getMap().getArrayMap();
		final Collisions getCollisions = this.getMap().getCollision();
		boolean collision1 = false;

		if (this instanceof Player1) {
			collision1 = getCollisions.checkCollisions(loadMap, Xpos + x, Ypos + y);
		} else {
			collision1 = getCollisions.checkGround(loadMap, Xpos + x, Ypos + y);
		}

		if (!collision1) {
			loadMap[Xpos + x][Ypos + y] = loadMap[Xpos][Ypos];
			loadMap[Xpos][Ypos] = new OilPlayer1(Xpos, Ypos);
			this.setPosition(Xpos + x, Ypos + y);
		} else if (collision1) {
			this.setStatePlayer1(false);
			/* loadMap[Xpos][Ypos] = new wallPlayer1(Xpos,Ypos); */

		}

	}

	public void movePlayer2(int x, int y) {
		final int Xpos = this.getPosition().getX();
		final int Ypos = this.getPosition().getY();
		final Entity[][] loadMap = this.getMap().getArrayMap();
		final Collisions getCollisions = this.getMap().getCollision();
		boolean collision2 = false;

		if (this instanceof Player2) {
			collision2 = getCollisions.checkCollisions(loadMap, Xpos + x, Ypos + y);
		} else {
			collision2 = getCollisions.checkGround(loadMap, Xpos + x, Ypos + y);
		}

		if (!collision2) {
			loadMap[Xpos + x][Ypos + y] = loadMap[Xpos][Ypos];
			loadMap[Xpos][Ypos] = new OilPlayer2(Xpos, Ypos);
			this.setPosition(Xpos + x, Ypos + y);
		} else if (collision2) {
			this.setStatePlayer2(false);
		}
	}

	public boolean getStatePlayer1() {
		return StatePlayer1;
	}

	public void setStatePlayer1(boolean alive1) {
		this.StatePlayer1 = alive1;
	}

	public boolean getStatePlayer2() {
		return StatePlayer2;
	}

	public void setStatePlayer2(boolean alive2) {
		this.StatePlayer2 = alive2;
	}

}
