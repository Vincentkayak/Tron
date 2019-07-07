package entity;

/**
 * The Class Element.
 *
 * @author Jean michel crapaud The class Element Saved as file Element.java
 */
public abstract class Entity {

	/** The position. */
	private Position position;

	/** The map. */
	private Map map;
	
	// Element constructor
	public Entity(final int x, final int y) {
		try {
			this.setPosition(x, y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Entity() {
		
	}
	
	public Position getPosition() {
		return this.position;
	}

	
	public void setPosition(int x, int y) throws Exception {
			this.position = new Position(x, y);

	}
	
	public Map getMap() {
		return this.map;
	}
	
	public void setMap(Map map) {
		this.map = map;
	}
	
}