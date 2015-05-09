package unit9;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CadenasAlumnoTest {

	public static CadenasAlumno ca;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		ca = new CadenasAlumno();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSonIguales() {
		
		boolean comprobar = ca.sonIguales("entornos","entornos");
		
		Assert.assertTrue(comprobar);
	}
	
	@Test
	public void testEsMayor() {
		
		boolean comprobar = ca.esMayor("ENTORNOS","entornos");
		
		Assert.assertTrue(comprobar);
	}
	
	@Test
	public void testEsMenor() {
		
		boolean comprobar = ca.esMenor("ENTORNOS","entornos");
		
		Assert.assertTrue(comprobar);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
