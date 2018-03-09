package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test
	public void testHelloWorld1() {
		HelloWorld hello = new HelloWorld();
		
		Assert.assertEquals(HelloWorld.HelloWorld1(), "Test");
		
	}

}
