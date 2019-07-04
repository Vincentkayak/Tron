package motionlesselement;

import entity.Sprite;

public class Ground extends MotionlessElement{

	private static char n;
	private static final Sprite SPRITE = new Sprite(n, "wall");
	
	public Ground(int x, int y) {
		super(SPRITE, x, y);
	}

}
