package motionlesselement;

import entity.Sprite;

/**
 * The Class Wall.
 *
 * @author Jean michel crapaud
 * The class Wall
 * Saved as file Wall.java
 */
public class Wall extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite("wall");

	/**
	 * Instantiates a new wall.
	 *
	 * @param x the x
	 * @param y the y
	 */
	// Wall constructor
	public Wall(int x, int y) {
		// Call the Motionless Element constructor to instantiate a new Motionless Element
		super(SPRITE, x, y);
	}
}
