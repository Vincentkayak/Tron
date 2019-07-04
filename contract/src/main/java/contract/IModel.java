package contract;

import java.sql.SQLException;
import java.util.Observable;

import entity.Map;

public interface IModel {

	/**
	 * Gets the hello world.
	 *
	 * @return the map entity
	 */
	Map getMap();

	/**
	 * Load the Map.
	 *
	 * @param i the code
	 * @throws Exception exception
	 * @throws SQLException SQLException
	 */
	void loadMap();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	/**
	 * Model notify.
	 */
	void modelNotify();

	void loop();

}
