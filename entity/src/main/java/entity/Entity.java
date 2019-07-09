package entity;

/**
 * The Class Entity.
 *
 * @author Vincent Jacques
 */
public abstract class Entity {
	private Position position;
	private Map map;
	
	public Entity(final int x, int y) {
		this.setPosition(x, y);
	}
	
	public Entity() {
		
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(int x, int y) {
		try {
			this.position = new Position(x, y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setMap(Map map) {
		this.map = map;
	}
	
	public Map getMap() {
		return this.map;
	}
	
	
}
