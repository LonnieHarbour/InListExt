package net.lharbour.inlistext;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class ObjectTypeHandler extends BaseTypeHandler<INList<?>> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, INList<?> parameter, JdbcType jdbcType)
			throws SQLException {
		Object object = parameter.consume();
		ps.setObject(i, object);
	}

	@Override
	public INList<?> getNullableResult(ResultSet rs, String columnName) throws SQLException {		
		return null;
	}

	@Override
	public INList<?> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {		
		return null;
	}

	@Override
	public INList<?> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {	
		return null;
	}	

}
