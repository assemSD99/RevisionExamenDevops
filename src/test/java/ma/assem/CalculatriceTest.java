package ma.assem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatriceTest {
	
	Calculatrice calculatrice;
	
	@Before
	public void setUp(){
		calculatrice = new Calculatrice();
	}
	@After
	public void setDown(){
		calculatrice = null;
	}
	@Test
	public void addTest(){
		int s = calculatrice.add(2,2);
		assertEquals(4,s,0.001);
	}
	@Test
	public void difTest(){
		int s = calculatrice.dif(3,2);
		assertEquals(1,s,0.001);
	}

	@Test(expected = ArithmeticException.class)
	public void divExecptionTest(){
		assertEquals(5,calculatrice.div(5,0));
	}

	@Test
	public void divValidTest(){
		assertEquals(5,calculatrice.div(10,2));
	}

	@Test
	public void divExceptionTryTest(){
		try{
			assertEquals(12,calculatrice.div(2,0));
		}catch (ArithmeticException e){
			assertEquals("la div sur 0 est impo",e.getMessage());
		}
	}

	@Test
	public void multiTest(){
		assertEquals(12,calculatrice.multi(6,2));
	}


}
