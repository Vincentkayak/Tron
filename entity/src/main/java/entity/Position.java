package entity;

public class Position {

	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	public Position(int x, int y) throws Exception {
		// Set the X Element Position
		if((x < 0) || (x > 74)){
			throw new Exception("Position X out of range");
		}
		this.x = x;
		
		// Set the Y Element Position
		if((y < 0) || (y > 49)) {
			throw new Exception("Position Y out of range");
		}
		this.y = y;
	}

	// Get the X Element Position
		public int getX() {
			return x;
		}

		// Get the Y Element Position
		public int getY() {
			return y;
		}
}
