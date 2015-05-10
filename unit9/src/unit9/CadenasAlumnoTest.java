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
		
		boolean comprobar = ca.esMenor("tornos","entornos");
		
		Assert.assertTrue(comprobar);
	}
	
	
	@Test
	public void testComparaIgnorandoMayusculas() {
		
		boolean comprobar = ca.comparaIgnorandoMayusculas("ENTORNOS", "entornos");
		
		Assert.assertTrue(comprobar);
	}
	
	
	@Test
	public void testReemplazaTodos() {
		
		String comprobar = ca.reemplazaTodos("EntornosEn", "En", "Re");
		Assert.assertEquals("RetornosRe",comprobar);
	}
	
	@Test
	public void testReemplazaPrimero() {
			
		String comprobar = ca.reemplazaPrimero("EntornosEn", "En", "Re");
		Assert.assertEquals("RetornosEn",comprobar);
	}
	
	@Test
	public void testQuitaEspacios() {
			
		String comprobar = ca.quitaEspacios("    quitar espacios   ");
		Assert.assertEquals("quitar espacios",comprobar);
	}
	
	@Test
	public void testConvertirMayusculas() {
			
		String comprobar = ca.convertirMayusculas("entornos");
		Assert.assertEquals("ENTORNOS",comprobar);
	}

	
	@Test
	public void testConvertirMinusculas() {
			
		String comprobar = ca.convertirMinusculas("ENTORNOS");
		Assert.assertEquals("entornos",comprobar);
	}
	
	
	@Test
	public void testLongitudCadena() {
			
		long comprobar = ca.longitudCadena("cinco");
		Assert.assertEquals(5,comprobar);
	}

	
	@Test
	public void testEmpiezaCon() {
		
		boolean comprobar = ca.empiezaCon("entornos","en");
		
		Assert.assertTrue(comprobar);
	}
	
	@Test
	public void testAcabaEn() {
		
		boolean comprobar = ca.acabaEn("entornos","os");
		
		Assert.assertTrue(comprobar);
	}
	
	
	@Test
	public void testPosicionPrimeraCadena() {
			
		long comprobar = ca.posicionPrimeraCadena("OrdeNAdor","NA");
		Assert.assertEquals(4,comprobar);
	}
	
	
	@Test
	public void testExtraerSubstring1() {
			
		String comprobar = ca.extraerSubstring("ENTORNOS", 4);
		Assert.assertEquals("RNOS",comprobar);
	}
	
	@Test
	public void testExtraerSubstring2() {
			
		String comprobar = ca.extraerSubstring("ENTORNOS", 4, 6);
		Assert.assertEquals("RN",comprobar);
	}
	
	
	@Test
	public void testConcatenaCadenas() {
			
		String comprobar = ca.concatenaCadenas("1º"," de DAM");
		Assert.assertEquals("1º de DAM",comprobar);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
