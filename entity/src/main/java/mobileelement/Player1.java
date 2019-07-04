package mobileelement;

import entity.Sprite;

public class Player1 extends MobileElement{


	private static char f;
	private static final Sprite SPRITE = new Sprite(f, "player1");
	
	public Player1(int x, int y) {
		super(SPRITE, y, x);
	}
}
