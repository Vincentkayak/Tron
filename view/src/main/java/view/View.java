package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean michel crapaud
 * The class View
 * Saved as file View.java
 */
public final class View implements IView, Runnable {

	/** The frame. */
	protected final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model the model
	 */
	// View constructor
	public View(final IModel model) {
		// Set the View Frame
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode the key code
	 * @return the controller order
	 */
	// Translate Key codes to Controller orders
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
				
			// To choose the Player direction
			case KeyEvent.VK_LEFT:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.RIGHT;
			case KeyEvent.VK_ESCAPE:
				System.exit(0);
			default:
				return ControllerOrder.NOTHING;
		}
	}

	/**
	 * Run.
	 */
	// Set the View Frame visible
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	// Set the View Frame controller
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	@Override
	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}
}
