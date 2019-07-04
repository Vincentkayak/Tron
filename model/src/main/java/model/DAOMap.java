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

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public Map find() {
		Map map = new Map();

		try {
			final String sql = "{call callMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				map = new Map(resultSet.getString("contentMap"));
			}
			return map;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	/*
	 * @Override public HelloWorld find(final String code) { HelloWorld helloWorld =
	 * new HelloWorld(); try { final String sql = "{call helloworldByCode(?)}";
	 * final CallableStatement call = this.getConnection().prepareCall(sql);
	 * call.setString(1, code); call.execute(); final ResultSet resultSet =
	 * call.getResultSet(); if (resultSet.first()) { helloWorld = new
	 * HelloWorld(resultSet.getInt("id"), code, resultSet.getString("message")); }
	 * return helloWorld; } catch (final SQLException e) { e.printStackTrace(); }
	 * return null; }
	 */

}