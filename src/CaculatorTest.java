import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.Test;

public class CaculatorTest {
	 private static Caculator calculator = new Caculator();
	    
	    @Before
	    public void setUp() throws Exception {
	        calculator.clear();
	    }

	    @Test
	    public void testAdd() {
	        calculator.add(2);
	        calculator.add(3);
	        assertEquals(5, calculator.getResult());
	    }

	    @Test
	    public void testSubstract() {
	        calculator.add(10);
	        calculator.substract(2);
	        assertEquals(8, calculator.getResult());
	    }

	    @Ignore("Multiply() Not yet implemented")
	    @Test
	    public void testMultiply() {
	    }

	    @Test
	    public void testDivide() {
	        calculator.add(8);
	        calculator.divide(2);
	        assertEquals(4, calculator.getResult());
	    }
	    @Test
		public void testDivide1() {
			calculator.add(80);
			calculator.divide(40);
			assertEquals(2,calculator.getResult());
		}

		@Test
		public void testSquare() {
			calculator.square(2);
			assertEquals(4,calculator.getResult());
		}

		@Test (timeout = 10)
		public void testSquareRoot() {
			calculator.squareRoot(144);
			assertEquals(12,calculator.getResult());
		}

		@Test
		public void testClear() {
			calculator.add(10);
			calculator.clear();
			assertEquals(0,calculator.getResult());
		}

		@Test
		public void testGetResult() {
			
		}
}
