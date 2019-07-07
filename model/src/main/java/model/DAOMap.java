package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Map;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
public class DAOMap extends DAOEntity<Map> {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection the connection
	 * @throws SQLException the SQL exception
	 */
	public DAOMap(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final Map entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final Map entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final Map entity) {
		// Not implemented
		return false;
	}

}