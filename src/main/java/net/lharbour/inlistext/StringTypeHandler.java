package net.lharbour.inlistext;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class StringTypeHandler extends BaseTypeHandler<INList<String>> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, INList<String> parameter, JdbcType jdbcType)
			throws SQLException {
		String string = parameter.consume();
		ps.setString(i, string);
	}

	@Override
	public INList<String> getNullableResult(ResultSet rs, String columnName) throws SQLException {		
		return null;
	}

	@Override
	public INList<String> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {		
		return null;
	}

	@Override
	public INList<String> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {	
		return null;
	}	

}
