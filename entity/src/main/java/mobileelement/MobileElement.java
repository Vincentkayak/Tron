package mobileelement;

import entity.Entity;
import entity.Sprite;

public abstract class MobileElement extends Entity {

	public MobileElement(Sprite sprite, int x, int y) {
		super(sprite, x, y);
	}
}