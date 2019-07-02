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

	/** The default sprite size. */
	private static int DEFAULT_SPRITE_SIZE = 16;

	/** The img. */
	private Image img;

	/** The map design. */
	private String mapDesign;

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
		this.img = null;
		try {
			// Load font image
			img = ImageIO.read(new File("..\\entity\\src\\main\\resources\\sprite\\wall.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Get Map design
		mapDesign = this.getViewFrame().getModel().getMap().getMapDesign();
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

		if (this.getViewFrame().getModel().getMap().getPlayer() != null) {
			// Clear the ViewPanel
			graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
			// Set the ViewPanel Properties
			super.paintComponent(graphics);
			graphics.fillRect(0, 0, getWidth(), getHeight());
			graphics.drawImage(img, 0, 0, 1920, 1080, this);

			// Draw all Elements
			for (int y = 0; y < this.getViewFrame().getModel().getMap().getWidth(); y++) {
				for (int x = 0; x < this.getViewFrame().getModel().getMap().getHeight(); x++) {
					graphics.drawImage(
							this.getViewFrame().getModel().getMap().getMapObjects(y, x).getSprite().getImage(),
							y * DEFAULT_SPRITE_SIZE, x * DEFAULT_SPRITE_SIZE, this);
				}
			}
			graphics.setColor(new Color(0x4240ff));// Blue : 0x4240ff

		}
		// Get Map design
		this.mapDesign = this.getViewFrame().getModel().getMap().getMapDesign();

	}

}
