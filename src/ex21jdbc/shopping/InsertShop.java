package ex21jdbc.shopping;

import java.sql.Statement;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl
{
	public InsertShop() {
		super("kosmo", "1234");
	}
	
	public static void main(String[] args)
	{
		String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
		String ORACLE_URL = "jdbc:oracle:thin://@localhost:152:xe";
		
		
		
	}
}
