package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IModel;
import entity.Entity;
import entity.Map;
import mobileelement.Player1;
import mobileelement.Player2;
import motionlesselement.Ground;
import motionlesselement.OilPlayer1;
import motionlesselement.OilPlayer2;
import motionlesselement.Wall;

/**
 * The Class ViewPanel.
 *
 * @author Jean michel crapaud The class ViewPanel Saved as file ViewPanel.java
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	private boolean endGame = false;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame the view frame
	 */
	// ViewFrame constructor
	public ViewPanel(final ViewFrame viewFrame) {
		// Set the ViewFrame
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		// Get Map design
		viewFrame.getModel().getMap();
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	// Get the ViewFrame
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame the new view frame
	 */
	// Set the ViewFrame
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	// Update ViewPanel
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/**
	 * Paint component.
	 *
	 * @param graphics the graphics
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	// Paint all graphics components
	@Override
	protected void paintComponent(final Graphics graphics) {
		Map map = this.viewFrame.getModel().getMap();
		Entity[][] MapContent = map.getArrayMap();
		Player1 player1 = null;
		Player2 player2 = null;
		final int width = 49;
		final int height = 74;
		if (map.getPlayer1() != null || map.getPlayer2() != null) {
			player1 = this.viewFrame.getModel().getMap().getPlayer1();
			player2 = this.viewFrame.getModel().getMap().getPlayer2();
			this.displayMap(graphics, width, height);
		} else {
			graphics.clearRect(0, 0, 600, 400);
		}
	}

	public void displayMap(Graphics graphics, int width, int height) {
		final int imageSize = 8;
		Map map = this.viewFrame.getModel().getMap();
		IModel getModel = this.viewFrame.getModel();
		Entity[][] loadMap = map.getArrayMap();
		Player1 player1 = this.viewFrame.getModel().getMap().getPlayer1();
		Player2 player2 = this.viewFrame.getModel().getMap().getPlayer2();
		for (int x = 0; x < 74; x++) {
			for (int y = 0; y < 46; y++) {
				if (loadMap[x][y] instanceof Wall) {
					graphics.setColor(Color.BLACK);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof Ground) {
					graphics.setColor(Color.WHITE);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof Player1) {
					graphics.setColor(Color.BLUE);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof Player2) {
					graphics.setColor(Color.RED);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof OilPlayer1) {
					graphics.setColor(new Color(0x7accf5));
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof OilPlayer2) {
					graphics.setColor(new Color(0xf78b8b));
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				}
			}
		}

		if (!player1.getAlivePlayer1() && endGame == false) {
			endGame = true;
			graphics.clearRect(0, 0, 600, 400);
			this.viewFrame.printMessage("Congratulations Player 2, you won !");
			System.exit(0);
		}

		if (!player2.getAlivePlayer2() && endGame == false) {
			endGame = true;
			graphics.clearRect(0, 0, 600, 400);
			this.viewFrame.printMessage("Congratulations Player 1, you won !");
			System.exit(0);
		}

	}
}
