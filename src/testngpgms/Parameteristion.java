package testngpgms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameteristion {
    
	@Parameters({"a"})
	@Test
	public void test(String v)
	{
		System.out.println(v);
	}
	
}

