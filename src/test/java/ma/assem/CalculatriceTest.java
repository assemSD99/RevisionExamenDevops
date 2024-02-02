package ma.assem;

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
}
