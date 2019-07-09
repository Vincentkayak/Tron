package entity;

import entity.Entity;
import motionlesselement.Ground;
import motionlesselement.OilPlayer1;
import motionlesselement.OilPlayer2;
import motionlesselement.Wall;

/**
 * The Class Collisions
 * 
 * @author Vincent Jacques
 *
 */

public class Collisions {
	
	public Collisions() {
		
	}
	
	public boolean checkCollisions(Entity[][] entity, int x, int y) {
		if(entity[x][y] instanceof Wall) {
			return true;
		} else if (entity[x][y] instanceof OilPlayer1) {
			return true;
		} else if (entity[x][y] instanceof OilPlayer2) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkGround(Entity[][] entity, int x, int y) {
		if(entity[x][y] instanceof Ground) {
			return false;
		}
		return true;
	}
}
