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
			case KeyEvent.VK_Q:
				return ControllerOrder.Q;
			case KeyEvent.VK_D:
				return ControllerOrder.D;
			case KeyEvent.VK_KP_LEFT:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_KP_RIGHT:
				return ControllerOrder.RIGHT;
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

	
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}
}
