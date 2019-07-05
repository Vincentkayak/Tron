package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IModel;
import entity.Entity;
import entity.Map;
import mobileelement.Player1;
import mobileelement.Player2;
import motionlesselement.Ground;
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

	/**
	 * Update.
	 *
	 * @param arg0 the arg 0
	 * @param arg1 the arg 1
	 */
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
		Entity[][] loadMap = map.getArrayMap();
		Player1 player1 = null;
		final int width = 49;
		final int height = 74;
		if (map.getPlayer1() != null) {
			player1 = this.viewFrame.getModel().getMap().getPlayer1();
			int player1PosX = this.viewFrame.getModel().getMap().getPlayer1().getPositionX();
			int player1PosY = this.viewFrame.getModel().getMap().getPlayer1().getPositionY();

		}
		this.displayMap(graphics, width, height);
	}

	public void displayMap(Graphics graphics, int width, int height) {
		final int imageSize = 8;
		Map map = this.viewFrame.getModel().getMap();
		IModel getModel = this.viewFrame.getModel();
		Entity[][] loadMap = map.getArrayMap();
		Player1 player1 = this.viewFrame.getModel().getMap().getPlayer1();
		for (int x = 0; x < 74; x++) {
			for (int y = 0; y < 49; y++) {
				if (loadMap[x][y] instanceof Wall) {
					graphics.setColor(Color.BLACK);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof Ground) {
					graphics.setColor(Color.WHITE);
					graphics.drawRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof Player1) {
					graphics.setColor(Color.BLUE);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				} else if (loadMap[x][y] instanceof Player2) {
					graphics.setColor(Color.RED);
					graphics.fillRect(x * imageSize, y * imageSize, 8, 8);
				}

			}
		}
	}

}
