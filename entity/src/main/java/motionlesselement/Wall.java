package motionlesselement;

import entity.Sprite;

public class Wall extends MotionlessElement{

	private static char w;
	private static final Sprite SPRITE = new Sprite(w, "wall");
	
	public Wall(int x, int y) {
		super(SPRITE, x, y);
	}

}
