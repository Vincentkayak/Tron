package mobileelement;

import entity.Sprite;

public class Player2 extends MobileElement{


	private static char s;
	private static final Sprite SPRITE = new Sprite(s, "wall");
	
	public Player2(int x, int y) {
		super(SPRITE, x, y);
		
	}
}
