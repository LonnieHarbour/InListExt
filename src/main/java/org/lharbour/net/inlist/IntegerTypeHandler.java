package org.lharbour.net.inlist;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class IntegerTypeHandler extends BaseTypeHandler<INList<Integer>> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, INList<Integer> parameter, JdbcType jdbcType)
			throws SQLException {
		Integer integer = parameter.consume();
		ps.setInt(i, integer);
	}

	@Override
	public INList<Integer> getNullableResult(ResultSet rs, String columnName) throws SQLException {		
		return null;
	}

	@Override
	public INList<Integer> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {		
		return null;
	}

	@Override
	public INList<Integer> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {	
		return null;
	}	

}
