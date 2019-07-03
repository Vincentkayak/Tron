package mobileelement;

import entity.Direction;
import entity.Sprite;

/**
 * The Class Player.
 *
 * @author Jean michel crapaud
 * The class Player
 * Saved as file Player.java
 */
public class Player extends MobileElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite("player");
	
	/** The Constant DIRECTION. */
	private static final Direction DIRECTION = null;
	
	/** The state. */
	private boolean state;

	/**
	 * Instantiates a new player.
	 *
	 * @param player the player
	 * @param x the x
	 * @param y the y
	 * @throws Exception exception 
	 */
	// Player constructor
	public Player(int player, int x, int y) throws Exception {
		// Call the Mobile Element constructor to instantiate a new Mobile Element
		super(SPRITE, DIRECTION, x, y);
	}

	/**
	 * Move player.
	 *
	 * @param direction the direction
	 * @throws Exception exception
	 */
	// Move Player method
	public void movePlayer(Direction direction) throws Exception {
		switch (direction) {
		case LEFT:
			this.changePosition(-1, 0);
			break;
		case RIGHT:
			this.changePosition(+1, 0);
			break;
		case NOTHING:
			break;
		}
	}

	/**
	 * Checks if is alive.
	 *
	 * @return true, if is alive
	 */
	// Check if Player is alive
	public boolean isAlive() {
		return this.state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	// Set the Player life state
	public void setState(boolean state) {
		this.state = state;
	}
}
