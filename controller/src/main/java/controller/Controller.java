package controller;

import java.sql.SQLException;

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
	/*public void orderPerform(final ControllerOrder controllerOrder) throws Exception {
		switch (controllerOrder) {
		// To Move Player
		case NOTHING:
			break;
		case LEFT: {
			// Move the Player
			this.model.getMap().getPlayer().movePlayer(this.model.getMap().getPlayer().chooseDirection(3));
			// Notify changes
			this.model.modelNotify();
		}
			break;
		case RIGHT: {
			// Move the Player
			this.model.getMap().getPlayer().movePlayer(this.model.getMap().getPlayer().chooseDirection(4));
			// Notify changes
			this.model.modelNotify();
		}
			break;
		default:
			throw new Exception("Invalid order");
		}

	}*/

	/**
	 * Play.
	 *
	 * @throws InterruptedException the interrupted exception
	 */
	// Game loop
	public final void play() throws InterruptedException {
		int moveOn = 1;
		while (true) {
			Thread.sleep(300);
			/*if (moveOn == 2) {
				// Refresh Opponents
				this.model.getMap().getOpponent().forEach((opponent) -> {
					try {
						opponent.refreshOpponents();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				// Notify changes
				this.model.modelNotify();
				moveOn = 1;
			} else*/ {
				moveOn++;
			};
			// Notify changes
			this.model.modelNotify();
			// Stop the Game
			//endOfGame();
		}

	}

	/**
	 * End of game.
	 *
	 * @throws InterruptedException the interrupted exception
	 */
	// Stop the Game
	/*public void endOfGame() throws InterruptedException {
		// Stop the Game if Player is dead
		if (this.model.getMap().getPlayer().isAlive() == false) {
			this.view.printMessage("Blurp !");
			System.exit(0);
		}
	}*/

	/**
	 * Sets the map.
	 *
	 * @param map the new map
	 * @throws Exception    exception
	 * @throws SQLException SQLException
	 */
	// Set the Map
	public void setMap(int map) throws SQLException, Exception {
		// Load the Map
		this.model.loadMap(map);
	}

	@Override
	public void control() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderPerform(ControllerOrder controllerOrder) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
