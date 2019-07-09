package entity;

import mobileelement.Player1;
import mobileelement.Player2;
import motionlesselement.Ground;
import motionlesselement.Wall;

/**
 * The Class Map
 * 
 * @author Vincent Jacques
 */

public class Map extends Entity {
	
	private String Content = "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnfnnnnnnnnnnnnnnnnnnnnnnnnnsnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" +
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" +
			"wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
	private Entity[][] mapObjects;
	private Collisions collision;
	
	public Map() {
		this.createMap();
		collision = new Collisions();
	}
	
	
	public String getContent() {
		return this.Content;
	}
	
	public void setContentMap(final String Content) {
		this.Content = Content;
	}

	public Collisions getCollision() {
		return collision;
	}
	
	public void setCollision(Collisions collision) {
		this.collision = collision;
	}
	
	public void createMap() {
		String map = this.getContent();
		int HeightMap = 46;
		int WidthMap = 74;
		this.mapObjects = new Entity[WidthMap][HeightMap];
		for (int y = 0; y < HeightMap; y++) {
			String[] finalMap = map.split("\n");
			for (int x = 0; x < WidthMap; x++) {
				switch (finalMap[y].toCharArray()[x]) {
				case 'w':
					mapObjects[x][y] = new Wall(x,y);
					break;
				case 'n':
					mapObjects[x][y] = new Ground(x,y);
					break;
				case 'f':
					mapObjects[x][y] = new Player1(x,y);
					break;
				case 's':
					mapObjects[x][y] = new Player2(x,y);
					break;
				default:
					break;
				}
				mapObjects[x][y].setMap(this);
			}
		}
	}
	
	public Entity[][] getArrayMap() {
		return this.mapObjects;
	}
	
	public Player1 getPlayer1() {
		Entity[][] entity = this.getArrayMap();
		for (int y = 0; y < 46; y++) {
			for (int x = 0; x < 74; x++) {
				if (entity[x][y] instanceof Player1) {
					return (Player1) entity[x][y];
				}
			}
		}
		return null;
	}
	
	
	public Player2 getPlayer2() {
		Entity[][] entity2 = this.getArrayMap();
		for (int y = 0; y < 46; y++) {
			for (int x = 0; x < 74; x++) {
				if (entity2[x][y] instanceof Player2) {
					return (Player2) entity2[x][y];
				}
			}
		}
		return null;
	}
	
	public void loop() {
		boolean p1 = this.getPlayer1().getStatePlayer1();
		boolean p2 = this.getPlayer2().getStatePlayer2();
		if(p1 == true && p2 == true) {
			this.getPlayer1().defaultDirection1();
			this.getPlayer2().defaultDirection2();
		}
		
	}

}
