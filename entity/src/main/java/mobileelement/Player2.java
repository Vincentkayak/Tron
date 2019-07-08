package mobileelement;

public class Player2 extends MobileElement{
	
	private int lastDirectionX;
	private int lastDirectionY;

	public Player2(int x, int y) {
		super(y, x);
	}

	public void changeDirectionPlayer2(char direction) {
		switch(direction) {
		case 'M':
			if (lastDirectionX == 0 && lastDirectionY == -1) {
				this.movePlayer2(-1, 0);
				this.setLastDirection2(-1,0);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.movePlayer2(0, +1);
				this.setLastDirection2(0, +1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.movePlayer2(+1, 0);
				this.setLastDirection2(+1, 0);
			} else if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.movePlayer2(0, -1);
				this.setLastDirection2(0, -1);
			} else {
				this.movePlayer2(-1, 0);
				this.setLastDirection2(-1, 0);
			}
			break;
		case 'L':
			if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.movePlayer2(0, +1);
				this.setLastDirection2(0, +1);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.movePlayer2(0, -1);
				this.setLastDirection2(0, -1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.movePlayer2(-1, 0);
				this.setLastDirection2(-1, 0);
			} else if(lastDirectionX == 0 && lastDirectionY == -1) {
				this.movePlayer2(+1, 0);
				this.setLastDirection2(+1, 0);
			} else {
				this.movePlayer2(+1, 0);
				this.setLastDirection2(+1, 0);
			}
			break;
		}

		}
	
	public void setLastDirection2(int x, int y) {
		this.lastDirectionX = x;
		this.lastDirectionY = y;
	}
	
	public int getLastDirectionXPlayer2() {
		return lastDirectionX;
	}
	
	public int getLastDirectionYPlayer2() {
		return lastDirectionY;
	}
	
	public void defaultDirection2() {
		this.movePlayer2(this.getLastDirectionXPlayer2(), this.getLastDirectionYPlayer2());
	}
}
