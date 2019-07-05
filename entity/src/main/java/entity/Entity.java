package entity;

/**
 * The Class Element.
 *
 * @author Jean michel crapaud The class Element Saved as file Element.java
 */
public abstract class Entity {

	/** The position. */
	private int positionX;
	private int positionY;

	/** The map. */
	private Map map;

	// Element constructor
	public Entity(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	
	public Entity() {
		
	}
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public void setPositionX(int x) {
		this.positionX = x;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	
	public void setPositionY(int y) {
		this.positionY = y;
	}
	
	public Map getMap() {
		return this.map;
	}
	
	public void setMap(Map map) {
		this.map = map;
	}
}