package mobileelement;

import entity.Collisions;
import entity.Entity;
import entity.Position;
import motionlesselement.OilPlayer1;
import motionlesselement.OilPlayer2;

public abstract class MobileElement extends Entity {
	
	protected boolean StatePlayer1;
	protected boolean StatePlayer2;

	public MobileElement(int x, int y) {
		super(x, y);
	}

	public void movePlayer1(int x, int y) throws Exception {
		final int positionX = this.getPosition().getX();
		final int positionY = this.getPosition().getY();
		final Entity[][] MapContent = this.getMap().getArrayMap();
		final Collisions getCollisions = this.getMap().getCollision();
		boolean collision1 = false;

		if (this instanceof Player1) {
			collision1 = getCollisions.checkCollisions(MapContent, positionX + x, positionY + y);
		} else {
			collision1 = getCollisions.checkEmpty(MapContent, positionX + x, positionY + y);
		}

		if(!collision1) {
			MapContent[positionX + x][positionY + y] = MapContent[positionX][positionY];
			MapContent[positionX][positionY] = new OilPlayer1(positionX,positionY);
			this.setPosition(positionX + x, positionY + y);
		} else if(collision1) {
			this.setStatePlayer1(false);
		}
	}
	
	public void movePlayer2(int x, int y) throws Exception {
		final int positionX = this.getPosition().getX();
		final int positionY = this.getPosition().getY();
		final Entity[][] MapContent = this.getMap().getArrayMap();
		final Collisions getCollisions = this.getMap().getCollision();
		boolean collision2 = false;

		if (this instanceof Player2) {
			collision2 = getCollisions.checkCollisions(MapContent, positionX + x, positionY + y);
		} else {
			collision2 = getCollisions.checkEmpty(MapContent, positionX + x, positionY + y);
		}

		if(!collision2) {
			MapContent[positionX + x][positionY + y] = MapContent[positionX][positionY];
			MapContent[positionX][positionY] = new OilPlayer2(positionX,positionY);
			this.setPosition(positionX + x, positionY + y);
		} else if(collision2) {
			this.setStatePlayer1(false);
		}
	}
	
	public boolean getStatePlayer1() {
		return StatePlayer1;
	}
	
	public void setStatePlayer1(boolean alive) {
		this.StatePlayer1 = alive;
	}
	
	public boolean getStatePlayer2() {
		return StatePlayer2;
	}
	
	public void setStatePlayer2(boolean alive2) {
		this.StatePlayer2 = alive2;
	}
}