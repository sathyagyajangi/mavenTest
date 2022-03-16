package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before
	public void init()
	{
		//initiate 
		
		System.out.println("before hook starts");
	}
	
	@After
	public void exit()
	{
		//close
		
		System.out.println("after hook stop");
	}

}