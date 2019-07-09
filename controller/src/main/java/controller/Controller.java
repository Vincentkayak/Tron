package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 * 
 * @author Vincent Jacques
 */
public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;
	

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
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
	public void control() {
		this.view.printMessage("Welcome on Tron ! Player one use Q and D to move, and the Player 2 use L and M");
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case Q:
				this.model.getMap().getPlayer1().changeDirectionPlayer1('Q');
				break;
			case S:
				this.model.getMap().getPlayer1().changeDirectionPlayer1('S');
				break;
			case M:
				this.model.getMap().getPlayer2().changeDirectionPlayer2('M');
				break;
			case L:
				this.model.getMap().getPlayer2().changeDirectionPlayer2('L');
				break;
			case NOTHING:
			default :
				break;
		}
	}
	
	
	public void start(int speed) {
		
		while(true) {
			this.model.loop();
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	

}
