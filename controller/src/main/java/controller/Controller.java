package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 *
 * @author Jean michel crapaud The class Controller Saved as file
 *         Controller.java
 */
public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	// Controller constructor
	public Controller(final IView view, final IModel model) {
		// Set the View
		this.setView(view);
		// Set the Model
		this.setModel(model);
	}

	/**
	 * Control.
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	// Set the View
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	// Set the Model
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 * @throws Exception exception
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	// Get user orders
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		// To Move Player
		case Q: {
			this.model.getMap();
		}
			break;
		case D: {
			this.model.getMap();
		}
			break;
		case LEFT: {
			this.model.getMap();
		}
			break;
		case RIGHT: {
			this.model.getMap();
		}
			break;
		default:
			break;
		}

	}

	@Override
	public void control() {
		// TODO Auto-generated method stub
		this.view.printMessage("Tron");
	}

}
