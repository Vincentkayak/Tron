package model;

import java.util.Observable;
import contract.IModel;
import entity.Map;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	private Map map;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.map = new Map();
	}

	/**
	 * Gets the hello world.
	 *
	 * @return the hello world
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public Map getMap() {
		return this.map;
	}

	/**
	 * Sets the hello world.
	 *
	 * @param helloWorld the new hello world
	 */
	private void setMap(final Map map) {
		this.map = map;
		this.modelNotify();
	}

	/**
	 * Load hello world.
	 *
	 * @param code the code
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	public Observable getObservable() {
		return this;
	}

	@Override
	public void modelNotify() {
		setChanged();
		notifyObservers();
	}

	@Override
	public void loop() {
		if(this.getMap().getPlayer1() != null && this.getMap().getPlayer2() != null) {
		this.getMap().loop();
		this.modelNotify();
		}
	}
}
