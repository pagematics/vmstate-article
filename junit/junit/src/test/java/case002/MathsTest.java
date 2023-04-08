package case002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathsTest {
	
	Maths maths;
	
	@BeforeEach
	public void setUp()
	{
		maths = new Maths();
	}
	
    @Test
    public void AddTest()
    {
    	assertEquals(30, maths.addNumbers(10, 18));
    }
    
}
