package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;
import ex21jdbc.prepared.SelectSQL;

public class SelectShop extends IConnectImpl
{
	
	public SelectShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute()
	{
		
		
	}
	
	public static void main(String[] args)
	{
		new SelectShop().execute();

	}

}
